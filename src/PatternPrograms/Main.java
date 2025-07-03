package PatternPrograms;

import java.util.Scanner;

public class Main {
    public static void main(String []args){
        System.out.println("*******  MENU  **********");
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Right Angle Triangle");
        System.out.println("2. Left Angle Triangle");
        System.out.println("3. Pyramid");
        System.out.println("4. Inverted Pyramid");
        System.out.println("5. Diamond Pattern");
        System.out.println("6. Hallow Pyramid");
        System.out.println("7. Square Pattern");
        System.out.println("8. Hallow Square");
        System.out.println("9. Rectangle Pattern");
        System.out.println("10. Hallow Rectangle");
        System.out.println("11. Numbers Left to Right");
        System.out.println("12. Numbers in Pyramid");
        System.out.println("13. Binary Pattern");
        System.out.println("14. Hallow Diamond");
        System.out.println("15. Rhombus Pattern");
        System.out.println("16. Hallow Rhombus Pattern");
        System.out.println("17. Pascal Triangle");
        System.out.println("18. Z Pattern");
        System.out.println("19. X Pattern");
        System.out.println("20. Butterfly Pattern");
        System.out.println("21. Pascal's Right Angle Triangle");
        System.out.println("22. Repeated Number Pattern In Each Row");
        System.out.println("23. Repeated Number In Each Column");
        System.out.println("24. Decreasing Number Triangle");
        System.out.println("25. Floyd's Triangle");
        System.out.println("26. Character Pyramid");
        System.out.println("27. Alternating Character Pattern");
        System.out.println("n. Exit !");

        System.out.println("Enter Your Choice ");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter no of rows print right angle triangle");
                int rows = scanner.nextInt();
                RightAngleTriangle.pattern(rows);
                break;
            case 2:
                System.out.println("Enter no of rows to print left angle triangle");
                int row =scanner.nextInt();
                LeftAngleTriangle.pattern(row);
                break;
            case 3:
                System.out.println("Enter no of rows to print Pyramid");
                int pyramidRows = scanner.nextInt();
                Pyramid.pyramid(pyramidRows);
                break;
            case 4:
                System.out.println("Enter no of rows to print Inverted Pyramid");
                int num =scanner.nextInt();
                InvertedPyramid.invertedPyramid(num);
                break;
            case 5:
                System.out.println("Enter no of rows to print Diamond Pattern");
                int diamondRows = scanner.nextInt();
                Diamond.pattern(diamondRows);
                break;
            case 6:
                System.out.println("Enter np of rows to print Hallow pyramid");
                int hallow=scanner.nextInt();
                HallowPyramid.pattern(hallow);
                break;
            case 7:
                System.out.println("Enter a size of Square Pattern");
                int size=scanner.nextInt();
                Square.pattern(size);
                break;
            case 8:
                System.out.println("Enter a size to print Hallow Square Pattern");
                int hallowSquare =scanner.nextInt();
                HallowSquare.pattern(hallowSquare);
                break;
            case 9:
                System.out.println("Enter the size of row to print Rectangle");
                int rectRow = scanner.nextInt();
                System.out.println("Enter the size of row to print Rectangle");
                int rectCol =scanner.nextInt();
                Rectangle.pattern(rectRow,rectCol);
                break;
            case 10:
                System.out.println("Enter the size of row to print Hallow Rectangle");
                int rectRows = scanner.nextInt();
                System.out.println("Enter the size of row to print Hallow Rectangle");
                int rectCols =scanner.nextInt();
                HallowRectangle.pattern(rectRows,rectCols);
                break;
            case 11:
                System.out.println("Enter the row size");
                int numRow = scanner.nextInt();
                System.out.println("Enter the col size to print numbers");
                int numCol = scanner.nextInt();
                NumbersLeftToRight.numbers(numRow, numCol);
                break;
            case 12:
                System.out.println("Enter no of rows to print numbers in Pyramid");
                int pyramidRow = scanner.nextInt();
                NumbersInPyramid.numbers(pyramidRow);
                break;
            case 13:
                System.out.println("Enter a number print Binary pattern");
                int binRow = scanner.nextInt();
                BinaryPattern.pattern(binRow);
                break;
            case 14:
                System.out.println("Enter a number to print Hallow Diamond");
                int diamond=scanner.nextInt();
                HallowDiamond.pattern(diamond);
                break;
            case 15:
                System.out.println("Enter a number to print Rhombus");
                int rhombus = scanner.nextInt();
                Rhombus.pattern(rhombus);
                break;
            case 16:
                System.out.println("Enter a number to print hallow rhombus");
                int hallowRhombus = scanner.nextInt();
                HallowRhombus.pattern(hallowRhombus);
                break;
            case 17:
                System.out.println("Enter no of rows to print Pascal Triangle");
                int pascal = scanner.nextInt();
                PascalTriangle.pattern(pascal);
                break;
            case 18:
                System.out.println("Enter size (>3) to print Z pattern");
                int sizeZ = scanner.nextInt();
                Zpattern.pattern(sizeZ);
                break;
            case 19:
                System.out.println("Enter size to print X Pattern");
                int sizeX = scanner.nextInt();
                Xpattern.pattern(sizeX);
                break;
            case 20:
                System.out.println("Enter size of the Butterfly");
                int butterFly = scanner.nextInt();
                ButterflyPattern.pattern(butterFly);
                break;
            case 21:
                System.out.println("Enter the rows of Pascal's Right Angle Triangle");
                int pascals = scanner.nextInt();
                PascalRightAngleTriangle.pattern(pascals);
                break;
            case 22:
                System.out.println("Enter no of rows to print Repeated Number Pattern");
                int repeatNumber = scanner.nextInt();
                RepeatedNumberPattern.pattern(repeatNumber);
                break;
            case 23:
                System.out.println("enter row size to print Repeated Each row");
                int numb1 =scanner.nextInt();
                System.out.println("enter col size to print Repeated Each Column");
                int numb2=scanner.nextInt();
                RepeatedNumberInColumn.pattern(numb1, numb2);
                break;
            case 24:
                System.out.println("enter no of rows to print Decreasing number Triangle");
                int DecreaseRow = scanner.nextInt();
                DecreasingNumberTriangle.pattern(DecreaseRow);
                break;
            case 25:
                System.out.println("enter no of rows to print Floyd's Triangle");
                int floyd= scanner.nextInt();
                FloydsTriangle.pattern(floyd);
                break;
            case 26:
                System.out.println("enter no of rows to print Character Pyramid");
                int charRows =  scanner.nextInt();
                CharacterPyramid.pattern(charRows);
                break;
            case 27:
                System.out.println("enter no of rows to print Alternating Character Pattern");
                int altRows = scanner.nextInt();
                AlternatingCharacterPattern.pattern(altRows);
                break;
            default:
                System.out.println("Invalid Choice !");
        }
    }
}
