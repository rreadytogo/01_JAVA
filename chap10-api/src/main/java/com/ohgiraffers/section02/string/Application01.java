package main.java.com.ohgiraffers.section02.string;

public class Application01 {

    public static void main(String[] args) {

        //String 클래스의 자주 사용하는 메소드들에 대해 숙지하고 사용할 수 있다.

        /*
        charAt() : 해당 문자열의 특정 인덱스에 해당하는 문자를 반환
                                    인덱스 : 0부터 시작하는 숫자체계 의미
                                    인덱스를 벗어난 정수를 인자로 전달하는 경우 : IndexOuOfBoundException이 발생한다

         */

        String str1 = "Cruel Summer";
        for (int i = 0; i < str1.length(); i++) {
            System.out.println("char At("+i+"): " + str1.charAt(i));
            //문자열은 문자열이기때문에 인덱스 접근이 가능하다
        }

        /*
        compareTo() : 인자로 전달된 문자열과 사전 순으로 비교하여
                      두 문자열이 같다면 0을 반환, 인자로 전달된 문자열보다 작으면 음수를,
                      크w면 양수 반환.
                      단, 이 메소드는 대소문자 구분하여 비교
         */

        System.out.println("==========compareTo()==================");
        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "oracle";


        System.out.println("compareTo() " + (str2.compareTo(str3)));
        System.out.println("compareTo() " + (str2.compareTo(str4)));
        System.out.println("compareTo() " + (str4.compareTo(str2)));
        //첫 번째 문자열이 두 번째 문자열보다 사전적으로 앞에 나오면 음수를 반환합니다.
        System.out.println("compareTo() " + (str2.compareTo(str5)));
//        첫 번째 문자열이 두 번째 문자열보다 사전적으로 앞에 나오면 음수를 반환합니다.
        //양,음,0으로 판독하는 것에 집중해야함

        System.out.println("compareToIgnoreCase() " + (str3.compareToIgnoreCase(str4)));

        /*
        concat() : 문자열에 인자로 전달된 문자열을 합쳐서 새로운 문자열을 반환한다.
        원본 문자열에는 영향 X
         */
        System.out.println("===============concat==============");
        System.out.println("concat() : " + (str2.concat(str5)));
        System.out.println("str2 : " + str2);
        // 원본이 변한 것은 아님을 확인할 수 있다.


        /*
        indexOf() : 문자열에서 특정 문자를 탐색하여 처음 일치하는 인덱스 위치를 정수형으로 변환
        단, 일치하는 문자가 없을 시 -1 반환

        기능 : 특정문자 탐색 기능
         */
        System.out.println("================indexOf==============");
         String indexOf = "java oracle";
        System.out.println("indexOf('a') : " + indexOf.indexOf('a'));
        System.out.println("indexOf('z') : " + indexOf.indexOf('z'));

        System.out.println("================lastIndexOf()==============");
        /*
        lastIndexOf() : 문자열 탐색을 뒤에서부터 하고 처음 일치하는 위치의 인덱스 반환
        단, 일치하는 문자 없을 경우 : -1 반환
         */
        System.out.println("lastIndexOf('a') : " + (indexOf.lastIndexOf('a')));
        //indexOf 넣고.
        // 7이 나오는 이유 : 띄어쓰기 제외하고 0 1 2 3 ~ 7. 7 출력


        System.out.println("================trim()==============");
        /*
        trim() : 문자열의 앞 뒤 공백을 제거한 문자열을 반환
         */
        String trumStr = "   java   ";
        System.out.println("trimStr :  #" + trumStr + "#");
        System.out.println("trim() : #" + trumStr.trim() + "#");
        System.out.println("trimStr : #" + trumStr + "#");
        //원본에 영향을 주는 것이 아님. 그대로 나오는 것을 볼 수 있다

        System.out.println("================toLowerCase() &   toUpperCase()==============");

        /*
        toLowerCase() : 모든 문자를 소문자로 변환시킨다
        toUpperCase() : 모든 문자를 대문자로 변환시킨다.
        원본에는 영향 X
         */
        String caseStr = "JavaOracle";
        System.out.println("toLowerCase() : " + caseStr.toLowerCase());
        System.out.println("toUpperCase() : " + caseStr.toUpperCase());
        System.out.println("caseStr : " + caseStr);
        //원본영향 없음을 확인할 수 있다

        System.out.println("================subString()==============");
        /*
        subString() : 문자열의 일부분을 잘라내어 새로운 문자열을 반환한다.
        원본에 영향 X
         */

        String javaOracle = "javaOracle";
        System.out.println("subString(3,6) : " + javaOracle.substring(3,6));
        //시작과 끝 지정
        System.out.println("subString(3) : " + javaOracle.substring(3));
        //시작
        System.out.println(javaOracle);

        System.out.println("================replace()==============");

        /*

        replace() : 문자열에서 대체할 문자열로 기존 문자열을 변경해서 반환
        원본에 영향 X

         */

        System.out.println("replace() : " + javaOracle.replace("java", "python"));
        System.out.println(javaOracle);
        //일부 문자열을 새롭게 바꾸어서 생성.

        System.out.println("========================length()==============");

        /*
        length() : 문자열의 길이를 정수형으로 반환
         */

        System.out.println("length() : " + javaOracle.length());
        System.out.println("빈 문자열 길이 : " + ("".length())); //0
        System.out.println("빈 문자열 길이 : " + (" ".length())); //1


        System.out.println("===============isEmpty()===============");

        /*

        isEmpty() : 문자열의 길이가 0 -> true
                    아니면           -> false

        길이가 0인 문자열은 null과 다르다

         */

        System.out.println("isEmpty() : " + "".isEmpty()); //true
        System.out.println("isEmpty() : " + " ".isEmpty()); //false
        System.out.println("isEmpty() : " + "abc".isEmpty());  //false






    }
}
