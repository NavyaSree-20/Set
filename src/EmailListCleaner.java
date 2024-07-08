package src;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class EmailListCleaner {
    private List<String>emailList;
    private Set<String>uniqueEmails;
    public EmailListCleaner(){
        emailList=new ArrayList<>();
        uniqueEmails=new HashSet<>();
    }
    public void addEmails(List<String>emails){
        emailList.addAll(emails);
    }
    public void removeDuplicates(){
        uniqueEmails.addAll(emailList);
        emailList.clear();
        emailList.addAll(uniqueEmails);
    }
    public void displayUniqueEmails(){
        System.out.println("Unique email address");
        for(String email:emailList){
            System.out.println(email);
        }
    }

    public static void main(String[] args) {
        EmailListCleaner cleaner=new EmailListCleaner();
        List<String>emails=new ArrayList<>();
        emails.add("navya@gmail.com");
        emails.add("priya@gmail.com");
        emails.add("navya@gmail.com");
        cleaner.addEmails(emails);
        cleaner.removeDuplicates();
        cleaner.displayUniqueEmails();
    }

}
