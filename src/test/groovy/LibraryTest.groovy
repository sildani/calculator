/*
 * This Spock specification was auto generated by running the Gradle 'init' task
 * by 'dsilva' at '5/4/17 6:22 PM' with Gradle 2.12
 *
 * @author dsilva, @date 5/4/17 6:22 PM
 */

import spock.lang.Specification

class LibraryTest extends Specification{
    def "someLibraryMethod returns true"() {
        setup:
        Library lib = new Library()
        when:
        def result = lib.someLibraryMethod()
        then:
        result == true
    }
}
