
package task33;

import java.util.HashSet;
import java.util.Set;

public class task33 {

    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();

        for (String email : emails) {
            int atIndex = email.indexOf('@');

            String localName = email.substring(0, atIndex);

            int plusIndex = localName.indexOf('+');

            if (plusIndex >= 0) {
                localName = localName.substring(0, plusIndex);
            }

            localName = localName.replace(".", "");

            String uniqueEmail =
                    localName + email.substring(atIndex);

            uniqueEmails.add(uniqueEmail);
        }

        return uniqueEmails.size();
    }

    public static void main(String[] args) {
        String[] emails = {
            "test.email+abc@gmail.com",
            "test.e.mail@gmail.com",
            "testemail@gmail.com"
        };

        task33 obj = new task33();

        int result = obj.numUniqueEmails(emails);

        System.out.println("Number of unique emails: " + result);
    }
}
