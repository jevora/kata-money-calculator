@Grab(group='com.github.docker-java', module='docker-java', version='3.2.9')
import static io.cucumber.groovy.EN.*

def dockerClient = DockerClient.getInstance()

Given(~/^the currency exchange service is available$/) { ->
    def containerConfig = [
            Image: 'joseevora/kata-exchange-rate-provider:1.0.0',
            Tty: true,
            Cmd: ['/bin/bash']
    ]
    def container = dockerClient.createContainer(containerConfig).exec()
    dockerClient.startContainerCmd(container.getId()).exec()

}
And(~/^the following exchange rates are available:$/) { ->


}
When(~/^the user converts (.+) (.+) to (.+)$/) { double amount, String baseCurrency, String targetCurrecy->


}
Then(~/^the user should receive (\d+) (.+)$/) { double convertedAmount, String targetCurrency->


}
Given(~/^the user accesses the currency conversion service$/) { ->


}
When(~/^the user attempts to convert (\d+) "([^"]*)" to "([^"]*)"$/) { int arg1, String arg2, String arg3 ->


}
Then(~/^the user receives an error message "([^"]*)"$/) { String arg1 ->


}