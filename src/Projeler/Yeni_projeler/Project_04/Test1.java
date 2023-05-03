package Projeler.Yeni_projeler.Project_04;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.TreeSet;

public class Test1 {

    @Test
    public void TotalLength1() {

        TotalLength tl = new TotalLength();

        HashSet<String> s1 = new HashSet<>();

        s1.add("lab");
        s1.add("17");
        s1.add("Java");
        s1.add("Collections");

        int i1 = tl.getTotalLength(s1);

        Assert.assertTrue("Expected result is 20 but your result is  " + i1,i1==20);

    }

    @Test
    public void TotalLength2() {

        TotalLength tl = new TotalLength();

        HashSet<String> s1 = new HashSet<>();

        s1.add("");

        int i1 = tl.getTotalLength(s1);

        Assert.assertTrue("Expected result is -1 but your result is  " + i1,i1==-1);

    }
    @Test
    public void TotalLength3() {

        TotalLength tl = new TotalLength();

        HashSet<String> s1 = new HashSet<>();

        s1.add("Expected");
        s1.add("result");
        s1.add("is");
        s1.add("getTotalLength");


        int i1 = tl.getTotalLength(s1);

        Assert.assertTrue("Expected result is 30 but your result is  " + i1,i1==30);

    }


    @Test
    public void sortHashSet1() {

        sortHashSet tl = new sortHashSet();

        HashSet<Integer> s1 = new HashSet<>();

        s1.add(1);
        s1.add(10);
        s1.add(5);
        s1.add(123);
        s1.add(2);
        s1.add(4);
        s1.add(44);

        ArrayList<Integer> i1 = new ArrayList<>();

        i1 = tl.sort(s1);

        TreeSet<Integer> i2 = new TreeSet<>();

        i2.add(1);
        i2.add(10);
        i2.add(5);
        i2.add(123);
        i2.add(2);
        i2.add(4);
        i2.add(44);

        System.out.println(i2);
        System.out.println(i1);
        int count = 0 ;
        for(Integer s : i2){

            Assert.assertTrue("expected result is " + i2 + " your result is " + i1,s==i1.get(count));

            count++;

        }
    }

    @Test
    public void sortHashSet2() {

        sortHashSet tl = new sortHashSet();

        HashSet<Integer> s1 = new HashSet<>();

        s1.add(1);
        s1.add(10);
        s1.add(5);
        s1.add(14);
        s1.add(120);
        s1.add(123);
        s1.add(2);
        s1.add(4);
        s1.add(44);

        ArrayList<Integer> i1 = new ArrayList<>();

        i1 = tl.sort(s1);

        TreeSet<Integer> i2 = new TreeSet<>();

        i2.add(1);
        i2.add(10);
        i2.add(5);
        i2.add(14);
        i2.add(120);
        i2.add(123);
        i2.add(2);
        i2.add(4);
        i2.add(44);

        System.out.println(i2);
        System.out.println(i1);
        int count = 0 ;
        for(Integer s : i2){

            Assert.assertTrue("expected result is " + s + " your result is " + i1.get(count),s==i1.get(count));

            count++;

        }
    }

    @Test
    public void DigitPowers1() {

        DigitPowers p1 = new DigitPowers();

        int result = p1.power4(1234);

        Assert.assertTrue(result == 354);


    }

    @Test
    public void DigitPowers2() {

        DigitPowers p1 = new DigitPowers();

        int result = p1.power4(652);

        System.out.println(result);
        Assert.assertTrue(result == 1937);

    }
    @Test
    public void DigitPowers3() {

        DigitPowers p1 = new DigitPowers();
        int result = p1.power4(43563);
        Assert.assertTrue(result == 2339);

    }


    @Test
    public void palindromeNum1() {

        PalindromeNumber p1 = new PalindromeNumber();

        int result = p1.palindromeNum(349);

        Assert.assertTrue("Expected result is 3 but your result is " + result , 3==result);


    }

    @Test
    public void palindromeNum2() {

        PalindromeNumber p1 = new PalindromeNumber();

        int result = p1.palindromeNum(528);

        Assert.assertTrue("Expected result is 2 but your result is " + result , 2==result);


    }

    @Test
    public void palindromeNum3() {

        PalindromeNumber p1 = new PalindromeNumber();

        int result = p1.palindromeNum(319);

        Assert.assertTrue("Expected result is 2 but your result is " + result , 2==result);


    }
    @Test
    public void LetterCount1() {

        LetterCount p1 = new LetterCount();

        LinkedHashMap<Character,Integer> result = new LinkedHashMap<>();
        result = p1.charCount("aabbccdddeee");

        Assert.assertTrue("Expected result is 2 for char a but your result is " + result.get('a') , result.get('a')==2);
        Assert.assertTrue("Expected result is 2 for char a but your result is " + result.get('b') , result.get('b')==2);
        Assert.assertTrue("Expected result is 2 for char a but your result is " + result.get('c') , result.get('c')==2);
        Assert.assertTrue("Expected result is 3 for char a but your result is " + result.get('d') , result.get('d')==3);
        Assert.assertTrue("Expected result is 3 for char a but your result is " + result.get('e') , result.get('e')==3);

    }

    @Test
    public void LetterCount2() {

        LetterCount p1 = new LetterCount();

        LinkedHashMap<Character,Integer> result = new LinkedHashMap<>();
        result = p1.charCount("kkkeeeeyyyyyyyyy");

        Assert.assertTrue("Expected result is 3 for char a but your result is " + result.get('k') , result.get('k')==3);
        Assert.assertTrue("Expected result is 4 for char a but your result is " + result.get('e') , result.get('e')==4);
        Assert.assertTrue("Expected result is 9 for char a but your result is " + result.get('y') , result.get('y')==9);

    }
}