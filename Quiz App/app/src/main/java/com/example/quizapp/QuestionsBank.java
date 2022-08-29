package com.example.quizapp;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    private static List<QuestionsList> javaQuestions() {
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Ce obiect se poate folosi pentru transmiterea de date intre activitati?", "String","EditText","Intent","Bundle", "Bundle", "");
        final QuestionsList question2 = new QuestionsList("Clasa FragmentTransaction este responsabilă cu:", "Interactiunea cu fragmentele in cadrul activitatilor","Operații cu fragmentare (adăugare, ștergere, înlocuire)","Gestionarea fragmentelor din cadrul activităților","Efecte de animație în trecerea la un nou fragment", "Operații cu fragmentare (adăugare, ștergere, înlocuire)", "");
        final QuestionsList question3 = new QuestionsList("Care dintre următoarele cuvinte cheie realizează moștenirea în Java?", "implements","inherits","super","extends", "extends", "");
        final QuestionsList question4 = new QuestionsList("În fișierele XML din directorul res/layout componentele vizuale au obligatoriu proprietățile:", "Android:id, android:width, android:height","Android:id si android:layout_gravity","Android:height si android:width","Android:layout_width si android:layout_height", "Android:layout_width si android:layout_height", "");
        final QuestionsList question5 = new QuestionsList("Orice activitate nou creată trebuie declarată și în fișierul:", "AndroidManifest.xml","Java asociat din directorul gen","Xml asociat din directorul res/menu","Xml asociat din directorul res/layout", "AndroidManifest.xml", "");
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);

        return questionsLists;
    }

    private static List<QuestionsList> csharpQuestions() {
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Care dintre următoarele conversii sunt folosite în C#, pentru conversia în tipul boolean?", "ToDate Time","ToChar","ToSingle","ToBoolean", "ToBoolean", "");
        final QuestionsList question2 = new QuestionsList("Care dintre următoarele variante se folosesc pentru declararea unui array în C#?", "int[5] intArray = new int[];","int[] intArray = new int[5];","int intArray[] = new int[5];","int[] intArray = new int[];", "int[] intArray = new int[5];", "");
        final QuestionsList question3 = new QuestionsList("LINQ semnifică:", "Language Integrated Query", "Language Included Query", "Local Integration Query","Lazy Integrated Query", "Language Integrated Query", "");
        final QuestionsList question4 = new QuestionsList("Care dintre următoarele variante nu reprezintă un tip de constructor în C#", "Constructor implicit","Constructor static","Constructor privat","Constructor de afișare", "Constructor de afișare", "");
        final QuestionsList question5 = new QuestionsList("Alege afirmația care este falsă: ", "În C#, destructorii pot fi utilizați numai în clase și o clasă poate conține un singur destructor","Destructorul din C# va accepta parametri și modificatori de acces","Destructorul se va invoca automat, ori de câte ori nu mai este necesară o instanță a unei clase","Destructorul este invocat automat de colectorul de gunoi (garbage collector), ori de câte ori obiectele clasei nu mai sunt necesare în aplicație.", "Destructorul din C# va accepta parametri și modificatori de acces", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);

        return questionsLists;
    }

    private static List<QuestionsList> pythonQuestions() {
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Care dintre următoarele variante reprezintă un obiect modificabil?", "float","complex","list","bool", "list", "");
        final QuestionsList question2 = new QuestionsList("Cum acționează funcția len() asupra unui șir?", "întoarce lungimea șirului","convertește la minuscule/majuscule literele din șir","elimină spațiile de la începutul și finalul șirului","convertește argumentul la șir", "întoarce lungimea șirului", "");
        final QuestionsList question3 = new QuestionsList("Un container de tipul  ['a', 'b', 4, 10] este: ", "un dicționar","tuplu","o mulțime","o listă", "o listă", "");
        final QuestionsList question4 = new QuestionsList("Ce ne afișează funcția print(sir[4:]), dacă sir='Python'", "on","Py","Python","n", "on", "");
        final QuestionsList question5 = new QuestionsList("Alegeți afirmația greșită: ", "Python este un limbaj tastat dinamic: tipul de date pentru o valoare este stabilit în timpul execuției, nu în avans.","Valoarea unor obiecte se poate modifica dupa ce au fost create: aceste obiecte sunt modificabile. ","list, set, dict, bytearray sunt nemodificabile."," Variabilele nu au nevoie de declarații explicite de tip pentru a li se rezerva spațiu în memorie. ", "list, set, dict, bytearray sunt nemodificabile.", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);

        return questionsLists;
    }

    private static List<QuestionsList> htmlQuestions() {
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Ce înseamnă HTML ? ", "HyperText Markup Link","HyperText Markup Language","HyperText Transfer Language","HyperText Transfer Protocol", "HyperText Markup Language", "");
        final QuestionsList question2 = new QuestionsList("Marcajul <B> …</B> realizează afişarea: ", "înclinată a textului","subliniată a textului","îngroşată a textului","îngroşată și subliniată a textului", "îngroşată a textului", "");
        final QuestionsList question3 = new QuestionsList("Introducerea unui element al unei liste se realizează prin marcajul: ", "<li>","<body>","<div>","<b>", "<li>", "");
        final QuestionsList question4 = new QuestionsList("Pentru a determina ca o celulă a tabelului săocupe spaţiul a două sau mai multe coloane se foloseşte atributul:", "width","rowspan","colspan","height", "rowspan", "");
        final QuestionsList question5 = new QuestionsList("O listă ordonată este reprezentată de: ", "<ol>","<li>","<ul>","<hr>", "<ol>", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);

        return questionsLists;
    }

    public static List<QuestionsList> getQuestions(String selectedTopicName){
        switch (selectedTopicName){
            case "Android Studio":
                return javaQuestions();
            case "C#":
                return csharpQuestions();
            case "Python":
                return pythonQuestions();
            default:
                return htmlQuestions();
        }
    }


}
