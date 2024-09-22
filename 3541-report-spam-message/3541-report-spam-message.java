class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
         Set<String> ban = new HashSet<>();
         int n=bannedWords.length;
         for(int i=0;i<n;i++){
                ban.add(bannedWords[i]);
         }
         int m=message.length;
         int count=0;
 for(int i=0;i<m;i++){
    if(count==2){
        break;
    }
 if(ban.contains(message[i])){
                    count++;
                    }
 }
 if(count==2){
      return true; 
    }
    return false;}
}