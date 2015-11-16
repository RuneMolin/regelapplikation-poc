package dk.skat.regelapp

import spock.lang.Specification

class SanitySpec extends Specification {

    def "The world is sane"() {
        given:
        Integer a = 42
        Integer b = 0

        when:
        Integer c = a / b

        then:
        thrown ArithmeticException
    }
}