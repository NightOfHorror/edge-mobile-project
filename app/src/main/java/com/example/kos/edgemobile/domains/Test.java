package com.example.kos.edgemobile.domains;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Константин on 02.12.2017.
 */

public class Test
{
   private List<Question>ListQuestions;
   public Test()
   {
       this.ListQuestions=new ArrayList<>();
   }
   // Генерируем первичный  тест
   public List<Question> GeneratePrimary()
   {
       return ListQuestions;
   }

   // Генерируем тренировочный тест
    public List<Question>GenerateTraining()
    {
        return ListQuestions;
    }

}
