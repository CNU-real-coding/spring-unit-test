public class NumberOfCount {

    private int vowelCount =0;
    private int consonantCount = 0;


    public int getVowelCount(){
        return vowelCount;
    }

    public int getConsonantCount(){
        return consonantCount;
    }

    public void getNumberOfCount(String str){
        String word = str.toLowerCase();

        for(int i=0; i<word.length(); i++){
            char charAtindex = word.charAt(i);
            if(charAtindex == 'a' || charAtindex == 'e' || charAtindex == 'i' || charAtindex == 'o' || charAtindex == 'u')
                vowelCount++;
            else if('a' <= charAtindex && charAtindex <= 'z' )
                consonantCount++;

            else
                continue;
        }

        System.out.println("자음의 개수" + consonantCount);
        System.out.println("모음의 개수" + vowelCount);

    }

}