/*
MissingOverride
javaFiveCompatibility = (default)false


*/

package com.puppycrawl.tools.checkstyle.checks.annotation.missingoverride;

public class InputMissingOverrideBadOverrideFromObject
{
    /**
     * {@inheritDoc}
     */
    public boolean // violation 'include @java.lang.Override annotation when '@inheritDoc''
    equals(Object obj) {
        return false;
    }

    /**
     * {@inheritDoc no violation}
     *
     * @inheritDocs}
     *
     * {@inheritDoc
     */
    public int hashCode() {
        return 1;
    }

    class Junk {

        /**
         * {@inheritDoc}
         */
        protected void // violation 'include @java.lang.Override annotation when '@inheritDoc''
        finalize() throws Throwable {}
    }
}

interface HashEq2 {

    /**
     * {@inheritDoc}
     */
    public int hashCode(); // violation 'include @java.lang.Override annotation when '@inheritDoc''
}

enum enum3 {
    B;

    /**
     * {@inheritDoc}
     */
    public String toString(){//violation 'include @java.lang.Override annotation when '@inheritDoc''
        return "B";
    }

    private static void test() {}
}
