/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.basicstructures;

import java.util.Scanner;
/**
 *
 * @author Alex
 */
public class Speech {
    
    public static void main(String[] args) {
        
        String speech="";
        String[] firstTemplate = new String[10];
        String[] secondTemplate = new String[11];
        String[] thirdTemplate = new String[11];
        String[] fourthTemplate = new String[10];
        int numberOfStrings, i;
        Scanner con = new Scanner(System.in);
        
        firstTemplate[0]="Дорогие друзья! ";
        firstTemplate[1]="с другой стороны ";
        firstTemplate[2]="равным образом ";
        firstTemplate[3]="Не следует, однако, забывать о том, что ";
        firstTemplate[4]="Таким образом, ";
        firstTemplate[5]="Повседневная практика показывает, что ";
        firstTemplate[6]="Значимость этих проблем настолько очевидна, что ";
        firstTemplate[7]="Разнообразный и богатый опыт ";
        firstTemplate[8]="Задача организации, в особенности же ";
        firstTemplate[9]="Соображения высшего порядка, а также ";
        
        secondTemplate[0]="реализация намеченных плановых заданий ";
        secondTemplate[1]="рамки и место обучения кадров ";
        secondTemplate[2]="постоянный количественный рост и сфера нашей активности ";
        secondTemplate[3]="сложившаяся структура организации ";
        secondTemplate[4]="новая модель ";
        secondTemplate[5]="организационной деятельности ";
        secondTemplate[6]="дальнейшее развитие различных форм деятельности ";
        secondTemplate[7]="постоянное информационно-пропагандистское обеспечение нашей деятельности ";
        secondTemplate[8]="укрепления и развития структуры ";
        secondTemplate[9]="консультация с широким активом ";
        secondTemplate[10]="начало повседневной работы по формированию позиции ";
        
        thirdTemplate[0]="играет важную роль в формировании ";
        thirdTemplate[1]="требуют от нас анализа ";
        thirdTemplate[2]="требуют определения и уточнения ";
        thirdTemplate[3]="способствует подготовке и реализации ";
        thirdTemplate[4]="обеспечивает широкому кругу специалистов участие в формировании ";
        thirdTemplate[5]="позволяет выполнить ";
        thirdTemplate[6]="важнейшие задания по разработке ";
        thirdTemplate[7]="в значительной степени обуславливает создание ";
        thirdTemplate[8]="позволяет оценить значение ";
        thirdTemplate[9]="представляет собой интересный эксперимент проверки ";
        thirdTemplate[10]="влечет за собой процесс внедрения и модернизации ";
        
        fourthTemplate[0]="существующих финансовых и административных условий";
        fourthTemplate[1]="дальнейших направлений развитая";
        fourthTemplate[2]="системы массового участия";
        fourthTemplate[3]="позиций, занимаемых участниками в отношении поставленных задач";
        fourthTemplate[4]="новых предложений";
        fourthTemplate[5]="направлений прогрессивного развития";
        fourthTemplate[6]="системы обучения кадров, соответствующей насущным потребностям";
        fourthTemplate[7]="соответствующих условий активизации";
        fourthTemplate[8]="модели развития";
        fourthTemplate[9]="форм воздействия";
        
        System.out.println("Введите количество предложений :");
        numberOfStrings=con.nextInt();
        if (numberOfStrings<10){
            numberOfStrings=10;
        }
        for (i=0; i<=numberOfStrings; i++){
            speech+=firstTemplate[(int)(Math.random()*9)];
            speech+=secondTemplate[(int)(Math.random()*10)];
            speech+=thirdTemplate[(int)(Math.random()*10)];
            speech+=fourthTemplate[(int)(Math.random()*9)];
            speech+="\n";
        }
        
        System.out.println("Ваша речь :");
        System.out.println(speech);
        
    }
    
}
