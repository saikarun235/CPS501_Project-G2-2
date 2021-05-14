package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    public static int height = 7;
    public static int width = 5;
    public static int i,j;

    @FXML public TextField userInput;
    @FXML public TextArea output;

    // StringBuilder objects are created to make the string mutable
    StringBuilder str1 = new StringBuilder();
    StringBuilder str2 = new StringBuilder();
    StringBuilder str3 = new StringBuilder();
    StringBuilder str4 = new StringBuilder();
    StringBuilder str5 = new StringBuilder();
    StringBuilder str6 = new StringBuilder();
    StringBuilder str7 = new StringBuilder();
    StringBuilder str0 = new StringBuilder();


// 2-Dimensional Arrays for each user input are initialised with values
// of 0/1which may include
//characters(a to z, A to Z),digits(0-9),other characters(~,!, ,#,$,%, ,&,*,(,), ,+,/,=,<,>,.etc)
// to print * (or) " "

    int[][] starA = {{0, 1, 1, 1, 1, 0}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}};
    int[][] starB = {{1, 1, 1, 1, 1, 0}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 1, 1, 1, 1, 0}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 1, 1, 1, 1, 0}};
    int[][] starC = {{0, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}, {0, 1, 1, 1, 1, 1}};
    int[][] starD = {{1, 1, 1, 1, 1, 0}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 1, 1, 1, 1, 0}};
    int[][] starE = {{1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1}};
    int[][] starF = {{1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}};
    int[][] starG = {{0, 1, 1, 1, 1, 0}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}, {1, 0, 1, 1, 1, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {0, 1, 1, 1, 1, 0}};
    int[][] starH = {{1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}};
    int[][] starI = {{1, 1, 1, 1, 1, 1}, {0, 0, 1, 0, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 0, 1, 0, 0, 0}, {1, 1, 1, 1, 1, 1}};
    int[][] starJ = {{1, 1, 1, 1, 1, 1}, {0, 0, 0, 1, 0, 0}, {0, 0, 0, 1, 0, 0}, {0, 0, 0, 1, 0, 0}, {0, 0, 0, 1, 0, 0}, {0, 0, 0, 1, 0, 0}, {1, 0, 0, 1, 0, 0}, {0, 1, 1, 0, 0, 0}};
    int[][] starK = {{1, 0, 0, 0, 1, 0}, {1, 0, 0, 1, 0, 0}, {1, 0, 1, 0, 0, 0}, {1, 1, 0, 0, 0, 0}, {1, 1, 0, 0, 0, 0}, {1, 0, 1, 0, 0, 0}, {1, 0, 0, 1, 0, 0}, {1, 0, 0, 0, 1, 0}};
    int[][] starL = {{1, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1}};
    int[][] starM = {{1, 0, 0, 0, 0, 1}, {1, 1, 0, 0, 1, 1}, {1, 0, 1, 1, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}};
    int[][] starN = {{1, 0, 0, 0, 0, 1}, {1, 1, 0, 0, 0, 1}, {1, 0, 1, 0, 0, 1}, {1, 0, 0, 1, 0, 1}, {1, 0, 0, 0, 1, 1}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}};
    int[][] starO = {{0, 1, 1, 1, 1, 0}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {0, 1, 1, 1, 1, 0}};
    int[][] starP = {{1, 1, 1, 1, 1, 0}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 1, 1, 1, 1, 0}, {1, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}};
    int[][] starQ = {{0, 1, 1, 1, 1, 0}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {0, 1, 1, 1, 1, 0}, {0, 0, 0, 0, 1, 0}, {0, 0, 0, 0, 0, 1}};
    int[][] starR = {{1, 1, 1, 1, 1, 0}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 1, 1, 1, 1, 0}, {1, 1, 0, 0, 0, 0}, {1, 0, 1, 0, 0, 0}, {1, 0, 0, 1, 0, 0}};
    int[][] starS = {{0, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}, {0, 1, 1, 1, 1, 0}, {0, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 0, 1}, {1, 1, 1, 1, 1, 0}, {0, 0, 0, 0, 0, 0}};
    int[][] starT = {{1, 1, 1, 1, 1, 1}, {0, 0, 1, 0, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 0, 1, 0, 0, 0}};
    int[][] starU = {{1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {0, 1, 1, 1, 1, 0}};
    int[][] starV = {{1, 0, 0, 0, 1, 0}, {1, 0, 0, 0, 1, 0}, {1, 0, 0, 0, 1, 0}, {1, 0, 0, 0, 1, 0}, {1, 0, 0, 0, 1, 0}, {1, 0, 0, 0, 1, 0}, {0, 1, 0, 1, 0, 0}, {0, 0, 1, 0, 0, 0}};
    int[][] starW = {{1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 1, 1, 0, 1}, {1, 1, 0, 0, 1, 1}, {1, 0, 0, 0, 0, 1}};
    int[][] starX = {{1, 0, 0, 0, 0, 1}, {0, 1, 0, 0, 1, 0}, {0, 0, 1, 1, 0, 0}, {0, 0, 1, 1, 0, 0}, {0, 1, 0, 0, 1, 0}, {1, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}};
    int[][] starY = {{0, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 1, 0}, {0, 1, 0, 1, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 0, 1, 0, 0, 0}};
    int[][] starZ = {{1, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 0}, {0, 0, 0, 1, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}};

    int[][] star0 = {{0, 1, 1, 1, 1, 0}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {0, 1, 1, 1, 1, 0}};
    int[][] star1 = {{0, 0, 0, 1, 0, 0}, {0, 0, 1, 1, 0, 0}, {0, 1, 0, 1, 0, 0}, {0, 0, 0, 1, 0, 0}, {0, 0, 0, 1, 0, 0}, {0, 0, 0, 1, 0, 0}, {0, 0, 0, 1, 0, 0}, {1, 1, 1, 1, 1, 1}};
    int[][] star2 = {{0, 0, 1, 1, 1, 0}, {0, 1, 0, 0, 0, 1}, {0, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 1, 0}, {0, 0, 0, 1, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1}};
    int[][] star3 = {{0, 1, 1, 1, 1, 0}, {1, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 0, 1}, {0, 0, 1, 1, 1, 0}, {0, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {0, 1, 1, 1, 1, 0}, {0, 0, 0, 0, 0, 0}};
    int[][] star4 = {{1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 0, 1}};
    int[][] star5 = {{1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 0, 1}, {1, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 0}};
    int[][] star6 = {{1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 1, 1, 1, 1, 1}};
    int[][] star7 = {{1, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 0, 1}};
    int[][] star8 = {{0, 1, 1, 1, 1, 0}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {0, 1, 1, 1, 1, 0}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {0, 1, 1, 1, 1, 0}, {0, 0, 0, 0, 0, 0}};
    int[][] star9 = {{1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 0, 1}, {1, 1, 1, 1, 1, 1}};

    int[][] stara = {{0, 1, 1, 1, 0, 0}, {1, 0, 0, 0, 1, 0}, {1, 0, 0, 0, 1, 0}, {1, 0, 0, 0, 1, 0}, {1, 0, 0, 0, 1, 0}, {0, 1, 1, 1, 1, 0}, {0, 0, 0, 0, 1, 0}, {0, 0, 0, 0, 0, 1}};
    int[][] starb = {{1, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 0, 0}, {1, 0, 0, 1, 0, 0}, {1, 0, 0, 1, 0, 0}, {1, 1, 1, 1, 0, 0}};
    int[][] starc = {{0, 0, 0, 0, 0, 0}, {0, 1, 1, 1, 1, 0}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 1}, {0, 1, 1, 1, 1, 0}};
    int[][] stard = {{0, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 0, 1}, {0, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {0, 1, 1, 1, 1, 1}};
    int[][] stare = {{0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 0, 0}, {1, 1, 1, 1, 0, 0}, {1, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 0, 0}};
    int[][] starf = {{0, 0, 1, 1, 1, 0}, {0, 1, 0, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {1, 1, 1, 1, 0, 0}, {0, 1, 0, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {0, 1, 0, 0, 0, 0}};
    int[][] starg = {{0, 1, 1, 1, 0, 0}, {1, 0, 0, 1, 0, 0}, {1, 0, 0, 1, 0, 0}, {1, 1, 1, 1, 0, 0}, {0, 0, 0, 1, 0, 0}, {0, 0, 0, 1, 0, 0}, {1, 0, 0, 1, 0, 0}, {1, 1, 1, 1, 0, 0}};
    int[][] starh = {{1, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 0, 0}, {1, 0, 0, 1, 0, 0}, {1, 0, 0, 1, 0, 0}, {1, 0, 0, 1, 0, 0}, {1, 0, 0, 1, 0, 0}};
    int[][] stari = {{0, 1, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {0, 1, 0, 0, 0, 0}};
    int[][] starj = {{0, 0, 1, 0, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 0, 1, 0, 0, 0}, {1, 1, 1, 0, 0, 0}};
    int[][] stark = {{1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 1, 0}, {1, 0, 0, 1, 0, 0}, {1, 1, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}, {1, 1, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 1}};
    int[][] starl = {{0, 1, 0, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {0, 1, 0, 0, 0, 0}};
    int[][] starm = {{0, 0, 0, 0, 0, 0}, {0, 1, 1, 1, 1, 0}, {1, 0, 1, 0, 0, 1}, {1, 0, 1, 0, 0, 1}, {1, 0, 1, 0, 0, 1}, {1, 0, 1, 0, 0, 1}, {1, 0, 1, 0, 0, 1}, {1, 0, 1, 0, 0, 1}};
    int[][] starn = {{1, 1, 1, 1, 0, 0}, {1, 0, 0, 1, 0, 0}, {1, 0, 0, 1, 0, 0}, {1, 0, 0, 1, 0, 0}, {1, 0, 0, 1, 0, 0}, {1, 0, 0, 1, 0, 0}, {1, 0, 0, 1, 0, 0}, {1, 0, 0, 1, 0, 0}};
    int[][] staro = {{0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 1, 1, 1, 0, 0}, {1, 0, 0, 1, 0, 0}, {1, 0, 0, 1, 0, 0}, {1, 0, 0, 1, 0, 0}, {1, 0, 0, 1, 0, 0}, {0, 1, 1, 1, 0, 0}};
    int[][] starp = {{1, 1, 1, 1, 0, 0}, {1, 0, 0, 1, 0, 0}, {1, 0, 0, 1, 0, 0}, {1, 0, 0, 1, 0, 0}, {1, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}};
    int[][] starq = {{0, 1, 1, 1, 0, 0}, {1, 0, 0, 1, 0, 0}, {1, 0, 0, 1, 0, 0}, {1, 1, 1, 1, 0, 0}, {0, 0, 0, 1, 0, 1}, {0, 0, 0, 1, 0, 1}, {1, 0, 0, 1, 1, 0}, {0, 0, 0, 1, 0, 0}};
    int[][] starr = {{0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 1, 0, 1, 0, 0}, {0, 0, 1, 0, 0, 0}, {1, 0, 1, 0, 0, 0}, {1, 0, 1, 0, 0, 0}, {1, 0, 1, 0, 0, 0}};
    int[][] stars = {{0, 0, 0, 0, 0, 0}, {0, 1, 1, 1, 1, 1}, {0, 1, 0, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 1}, {0, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 0}};
    int[][] start = {{0, 0, 0, 1, 0, 0}, {0, 0, 0, 1, 0, 0}, {0, 0, 0, 1, 0, 0}, {1, 1, 1, 1, 1, 1}, {0, 0, 0, 1, 0, 0}, {0, 0, 0, 1, 0, 0}, {0, 0, 0, 1, 0, 0}, {0, 0, 0, 1, 0, 0}};
    int[][] staru = {{1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {0, 1, 0, 0, 1, 0}};
    int[][] starv = {{1, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 0, 0}, {0, 1, 0, 0, 1, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 1, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 1, 0, 0, 0}};
    int[][] starw = {{1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 1, 0, 0, 1}, {1, 0, 1, 0, 0, 1}, {1, 0, 1, 0, 0, 1}, {1, 1, 0, 1, 0, 1}};
    int[][] starx = {{0, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 1}, {0, 1, 0, 0, 1, 0}, {0, 0, 1, 1, 0, 0}, {0, 0, 1, 1, 0, 0}, {0, 1, 0, 0, 1, 0}, {1, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 0, 0}};
    int[][] stary = {{1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 1}, {0, 1, 1, 1, 1, 0}, {0, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 0, 1}, {1, 1, 1, 1, 1, 0}};
    int[][] starz = {{1, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 0}, {0, 0, 0, 1, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}};

    int[][] starHash        = {{0, 0, 0, 0, 0, 0}, {0, 0, 1, 1, 0, 0}, {0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {0, 0, 1, 1, 0, 0}, {0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0}};
    int[][] starExclamation = {{0, 1, 0, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}};
    int[][] starDollar      = {{0, 1, 1, 1, 1, 1}, {1, 0, 0, 1, 0, 0}, {1, 0, 0, 1, 0, 0}, {0, 1, 1, 1, 1, 0}, {0, 0, 0, 1, 0, 1}, {0, 0, 0, 1, 0, 1}, {1, 1, 1, 1, 1, 0}, {0, 0, 0, 1, 0, 0}};
    int[][] starPercent     = {{0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 1}, {1, 1, 0, 0, 1, 0}, {1, 1, 0, 1, 0, 0}, {0, 0, 1, 0, 1, 1}, {0, 1, 0, 0, 1, 1}, {1, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}};
    int[][] starAsterisk    = {{0, 0, 1, 0, 0, 0}, {1, 0, 1, 0, 1, 0}, {0, 1, 1, 1, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 1, 0, 1, 0, 0}, {1, 0, 0, 0, 1, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}};
    int[][] starOpenBraces  = {{0, 0, 0, 1, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 0, 0, 1, 0, 0}, {0, 0, 0, 0, 0, 0}};
    int[][] starClosedBraces= {{0, 0, 0, 1, 0, 0}, {0, 0, 0, 0, 1, 0}, {0, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 1, 0}, {0, 0, 0, 1, 0, 0}, {0, 0, 0, 0, 0, 0}};
    int[][] starPlus        = {{0, 0, 0, 0, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 0, 1, 0, 0, 0}, {1, 1, 1, 1, 1, 0}, {0, 0, 1, 0, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}};
    int[][] starForwardSlash= {{0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 1, 0}, {0, 0, 0, 1, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}};
    int[][] starEqualTo     = {{0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 1, 1, 1, 1, 0}, {0, 1, 1, 1, 1, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}};
    int[][] starLessThan    = {{0, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 1, 0}, {0, 0, 0, 1, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 0, 0, 1, 0, 0}, {0, 0, 0, 0, 1, 0}, {0, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 0, 0}};
    int[][] starGreaterThan = {{1, 0, 0, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 0, 0, 1, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}};
    int[][] starAmpersand   = {{0, 0, 1, 0, 0, 0}, {0, 1, 0, 1, 0, 0}, {0, 1, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 1, 1, 0, 0, 0}, {0, 0, 0, 0, 1, 0}, {1, 0, 0, 1, 0, 0}, {0, 1, 1, 0, 1, 1}};

    // 2-Dimensional Result Array is declared which prints the digitalized
//text of each user input in output area.
    int[][] res;

    @FXML
    public void handleButtonPrintAction(ActionEvent actionEvent) {
// All the values initially present in the string objects are deleted
//and are replaced with zero
        str0.delete(0,str0.length());
        str1.delete(0,str1.length());
        str2.delete(0,str2.length());
        str3.delete(0,str3.length());
        str4.delete(0,str4.length());
        str5.delete(0,str5.length());
        str6.delete(0,str6.length());
        str7.delete(0,str7.length());

        output.clear();
//getText() method allows the user to give the input in the TextField
        String user = userInput.getText();
// Boolean value of false in the setEditable() method does not allow
// the user to change/alter the text in the TextArea once after the
//output is displayed
        output.setEditable(false);
// setPrefHeight() method is adjusting the height of output box
// (or) TextArea to 150.0 inches
        output.setPrefHeight(150.0);
// setPrefWidth() method is adjusting the width of the output field to
// 800 inches
        output.setPrefWidth(800.0);

//  if loop gets executed only when userlength of inputted characters
// lie between 0 to 20
        if (user.length() <= 20) {
// for loop gets executed to all the user inputted characters
            for (int z = 0; z < user.length(); z++) {
// ch stores the input character entered by the user and the switch
// condition at that particular character gets executed
                char ch = user.charAt(z);

                switch (ch) {
// 2-Dimensional starA array values are assigned and stored in the
// res 2-Dimensional array
                    case 'A':
                        res = starA;
                        break;
                    case 'B':
                        res = starB;
                        break;
                    case 'C':
                        res = starC;
                        ;
                        break;
                    case 'D':
                        res = starD;
                        break;
                    case 'E':
                        res = starE;
                        break;
                    case 'F':
                        res = starF;
                        break;
                    case 'G':
                        res = starG;
                        break;
                    case 'H':
                        res = starH;
                        break;
                    case 'I':
                        res = starI;
                        break;
                    case 'J':
                        res = starJ;
                        break;
                    case 'K':
                        res = starK;
                        break;
                    case 'L':
                        res = starL;
                        break;
                    case 'M':
                        res = starM;
                        break;
                    case 'N':
                        res = starN;
                        break;
                    case 'O':
                        res = starO;
                        ;
                        break;
                    case 'P':
                        res = starP;
                        break;
                    case 'Q':
                        res = starQ;
                        break;
                    case 'R':
                        res = starR;
                        break;
                    case 'S':
                        res = starS;
                        break;
                    case 'T':
                        res = starT;
                        break;
                    case 'U':
                        res = starU;
                        break;
                    case 'V':
                        res = starV;
                        break;
                    case 'W':
                        res = starW;
                        break;
                    case 'X':
                        res = starX;
                        break;
                    case 'Y':
                        res = starY;
                        break;
                    case 'Z':
                        res = starZ;
                        break;
                    case 'a':
                        res = stara;
                        ;
                        break;
                    case 'b':
                        res = starb;
                        break;
                    case 'c':
                        res = starc;
                        break;
                    case 'd':
                        res = stard;
                        break;
                    case 'e':
                        res = stare;
                        break;
                    case 'f':
                        res = starf;
                        break;
                    case 'g':
                        res = starg;
                        break;
                    case 'h':
                        res = starh;
                        break;
                    case 'i':
                        res = stari;
                        break;
                    case 'j':
                        res = starj;
                        break;
                    case 'k':
                        res = stark;
                        break;
                    case 'l':
                        res = starl;
                        break;
                    case 'm':
                        res = starm;
                        break;
                    case 'n':
                        res = starn;
                        break;
                    case 'o':
                        res = staro;
                        break;
                    case 'p':
                        res = starp;
                        break;
                    case 'q':
                        res = starq;
                        break;
                    case 'r':
                        res = starr;
                        break;
                    case 's':
                        res = stars;
                        break;
                    case 't':
                        res = start;
                        break;
                    case 'u':
                        res = staru;
                        break;
                    case 'v':
                        res = starv;
                        break;
                    case 'w':
                        res = starw;
                        break;
                    case 'x':
                        res = starx;
                        break;
                    case 'y':
                        res = stary;
                        break;
                    case 'z':
                        res = starz;
                        break;
                    case '0':
                        res = star0;
                        break;
                    case '1':
                        res = star1;
                        break;
                    case '2':
                        res = star2;
                        break;
                    case '3':
                        res = star3;
                        break;
                    case '4':
                        res = star4;
                        break;
                    case '5':
                        res = star5;
                        break;
                    case '6':
                        res = star6;
                        break;
                    case '7':
                        res = star7;
                        break;
                    case '8':
                        res = star8;
                        break;
                    case '9':
                        res = star9;
                        break;
                    case '#':
                        res = starHash;
                        break;
                    case '!':
                        res = starExclamation;
                        break;
                    case '$':
                        res = starDollar;
                        break;
                    case '%':
                        res = starPercent;
                        break;
                    case '*':
                        res = starAsterisk;
                        break;
                    case '(':
                        res = starOpenBraces;
                        break;
                    case ')':
                        res = starClosedBraces;
                        break;
                    case '+':
                        res = starPlus;
                        break;
                    case '/':
                        res = starForwardSlash;
                        break;
                    case '=':
                        res = starEqualTo;
                        break;
                    case '<':
                        res = starLessThan;
                        break;
                    case '>':
                        res = starGreaterThan;
                        break;
                    case '&':
                        res = starAmpersand;
                        break;
                    default:
                        System.out.println("Please enter A-Z or 0-9 or a-z or special characters");

                }

                for (i = 0; i <= height; i++) { //This for loop is used for number of rows.
                    for (j = 0; j <= width; j++) { //This for loop is used for number of columns.
// if the value at i th row and j th column is 1 the below "if" loop gets
//executed
                        if (res[i][j] == 1) {
//if the value present at zeroeth row is 1 then "*" is printed at zeroeth
//row and j th column
                            if(i == 0) {
                                str0.append("*  ");
                            }
//if the value present at first row is 1 then "*" is printed at first
//row and j th column
                            if(i == 1) {
                                str1.append("*  ");
                            }
//if the value present at second row is 1 then "*" is printed at second
//row and j th column
                            if(i == 2) {
                                str2.append("*  ");
                            }
//if the value present at third row is 1 then "*" is printed at third
//row and j th column
                            if(i == 3) {
                                str3.append("*  ");
                            }
//if the value present at fourth row is 1 then "*" is printed at fourth
//row and j th column
                            if(i == 4) {
                                str4.append("*  ");
                            }
//if the value present at fifth row is 1 then "*" is printed at fifth
//row and j th column
                            if(i == 5) {
                                str5.append("*  ");
                            }
//if the value present at sixth row is 1 then "*" is printed at sixth
//row and j th column
                            if(i == 6) {
                                str6.append("*  ");
                            }
//if the value present at seventh row is 1 then "*" is printed at seventh
//row and j th column
                            if(i == 7) {
                                str7.append("*  ");
                            }
                        }
// if the value present at i th row and j th column is zero then else
// loop gets executed
                        else {
//if the value present at zeroeth row is 0 then " "/empty character
//is printed at zeroeth row and j th column
                            if(i == 0) {
                                str0.append("    ");
                            }
//if the value present at first row is 0 then " " is printed at first
//row and j th column
                            if(i == 1) {
                                str1.append("    ");
                            }
//if the value present at second row is 0 then " " is printed at second
//row and j th column
                            if(i == 2) {
                                str2.append("    ");
                            }
//if the value present at third row is 0 then " " is printed at third
//row and j th column
                            if(i == 3) {
                                str3.append("    ");
                            }
//if the value present at fourth row is 0 then " " is printed at fourth
//row and j th column
                            if(i == 4) {
                                str4.append("    ");
                            }
//if the value present at fifth row is 0 then " " is printed at fifth
//row and j th column
                            if(i == 5) {
                                str5.append("    ");
                            }
//if the value present at sixth row is 0 then " " is printed at sixth
//row and j th column
                            if(i == 6) {
                                str6.append("    ");
                            }
//if the value present at seventh row is 0 then " " is printed at
//seventh row and j th column
                            if(i == 7) {
                                str7.append("    ");
                            }
                        }
                    }
// After the first character gets printed then all the data in the 7 string
// objects is replaced with " " (empty character) for the next character
                    if(i == 7) {
                        str0.append("     ");
                        str1.append("     ");
                        str2.append("     ");
                        str3.append("     ");
                        str4.append("     ");
                        str5.append("     ");
                        str6.append("     ");
                        str7.append("     ");
                    }
                }

            }
// Initially all the stringBuilders are in the form of objects, the
// toString() method is used to convert all the stringBuilder objects to
// strings
            output.appendText(str0.toString());
            output.appendText("\n");
            output.appendText(str1.toString());
            output.appendText("\n");
            output.appendText(str2.toString());
            output.appendText("\n");
            output.appendText(str3.toString());
            output.appendText("\n");
            output.appendText(str4.toString());
            output.appendText("\n");
            output.appendText(str5.toString());
            output.appendText("\n");
            output.appendText(str6.toString());
            output.appendText("\n");
            output.appendText(str7.toString());

        }
// if the user input characters are more than 20 then this else loop
// gets executed
        else {

            System.out.println("Please enter the string length should be less than 20.");

        }

    }

}