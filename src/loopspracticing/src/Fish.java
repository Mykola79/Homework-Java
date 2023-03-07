package loopspracticing.src;

public class Fish {public static void main(String[] args ){


    String word = "Fish";
    while(true){if(word.length()>=8){break;}
        else{word=word+word;}

        System.out.println(word);
}
}}
