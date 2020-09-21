package com.dimitar.algorithms.nxlog;

/**
 * The following method compares product version in the format
 * "<major_version>.<minor_version>.<build_number>" and gives greater or equal result for current version.
 *
 *  Is there a problem in the code which will give incorrect result for some values,
 *  and if there is write solution which will give the correct result.
 */
public class Task1 {

    /***
     * Util method to append zeros.
     * @param str
     * @param len
     * @return
     */
    public static String appendZeros(final String str, final int len) {
        if (str.length() >= len) return str;
        else return appendZeros(str + "0", len);
    }

    public static boolean isCurrentVersionHigherOrEqual(String agentVersion, String currentAgentVersion) {
        String _currentAgentVersion = currentAgentVersion.replaceAll("\\.", "");
        String _agentVersion = agentVersion.replaceAll("\\.", "");

        // If both versions come with the same format, we are OK, but if we do not append minor version and build number, then this is not good.
        // I guess, we need to make them the same length

        final int currentVerLen = _currentAgentVersion.length();
        final int agentVerLen = _agentVersion.length();

        StringBuilder stringBuilder = new StringBuilder();
        if (currentVerLen > agentVerLen) {
            // We need to append zeros to agent version
            _agentVersion = stringBuilder.append(appendZeros(_agentVersion,currentVerLen )).toString();
        } else {
            _currentAgentVersion = stringBuilder.append(appendZeros(_currentAgentVersion,agentVerLen )).toString();
        }

        return Integer.valueOf(_currentAgentVersion) >= Integer.valueOf(_agentVersion);
    }

    public static void main(String[] args) {
       // System.out.println(isCurrentVersionHigherOrEqual("2.3.10", "2.3.11")); //true
       // System.out.println(isCurrentVersionHigherOrEqual("1.2.12", "2.0")); //true
       // System.out.println(isCurrentVersionHigherOrEqual("2.3.10", "1.3.11")); //false

        System.out.println(isCurrentVersionHigherOrEqual("2", "1.3.11")); //false
    }
}
