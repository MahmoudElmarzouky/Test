/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calc extends Application {
    public int cnt1 = 1;
    public int cnt2 = 1;

    @Override
    public void start(Stage stage) throws Exception {
        String blackBorder = "-fx-border-style: solid; -fx-border-width: 1; -fx-border-color: black";
        
        
        
        // Left column
        
        Button prtscr = new Button("PrtScn"); 
        Button insert = new Button("Insert"); 
        Button pgup = new Button("PgUp"); 
        Button pgdn = new Button("PgDn");                                                                                                                              
        Button home = new Button("Home"); 
        Button end = new Button("End"); 
        Button pause = new Button("Pause");
        Button option = new Button("Options");
        Button scrlock = new Button("ScrLk");
        Button help = new Button("Help");
        
        prtscr.setMinSize(60, 50);
        insert.setMinSize(60, 50);
        pgup.setMinSize(60, 50);
        pgdn.setMinSize(60, 50);
        home.setMinSize(60, 50);
        end.setMinSize(60, 50);
        pause.setMinSize(60, 50);
        option.setMinSize(60, 50);
        scrlock.setMinSize(60, 50);
        help.setMinSize(60, 50);
        
        prtscr.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
        insert.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
        pgup.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
        pgdn.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
        home.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
        end.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
        pause.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
        option.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
        scrlock.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
        help.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
        
        
        
        VBox R1 = new VBox(home,end,insert,prtscr,option);
        VBox R2 = new VBox(pgup,pgdn,pause,scrlock,help);
        VBox R3 = new VBox();
        R1.setSpacing(3);  
        R2.setSpacing(3);
        R3.setMinSize(1,1);
        
        HBox h111 = new HBox(R3,R1,R2);
        h111.setSpacing(3);

        Button esc = new Button("Esc"); 
        Button axo = new Button("~    `"); 
        Button k1 = new Button("!    1"); 
        Button k2 = new Button("@    2"); 
        Button k3 = new Button("#    3"); 
        Button k4 = new Button("$    4"); 
        Button k5 = new Button("%    5"); 
        Button k6 = new Button("^    6"); 
        Button k7 = new Button("&    7"); 
        Button k8 = new Button("*    8"); 
        Button k9 = new Button("(    9"); 
        Button k0 = new Button(")    0"); 
        Button us = new Button("_    -"); 
        Button eqadd = new Button("+    ="); 
        Button bs = new Button("BackSpace"); 
        Button tab = new Button("Tab"); 
        Button q = new Button("Q"); 
        Button w = new Button("W"); 
        Button ee = new Button("E"); 
        Button r = new Button("R"); 
        Button t = new Button("T"); 
        Button y = new Button("Y"); 
        Button u = new Button("U"); 
        Button i = new Button("I"); 
        Button o = new Button("O"); 
        Button p = new Button("P"); 
        Button pre = new Button("{     ["); 
        Button epre = new Button("}     ]"); 
        Button ent = new Button("Enter"); 
        Button capslock = new Button("Caps lock"); 
        Button a = new Button("A"); 
        Button s = new Button("S"); 
        Button d = new Button("D"); 
        Button f = new Button("F"); 
        Button g = new Button("G"); 
        Button h = new Button("H"); 
        Button j = new Button("J"); 
        Button k = new Button("K"); 
        Button l = new Button("L"); 
        Button sm = new Button(":      ;"); 
        Button pp = new Button("''     '"); 
        Button pp1 = new Button("\\    "); 
        Button shift = new Button("Shift"); 
        Button z = new Button("Z"); 
        Button x = new Button("X"); 
        Button c = new Button("C"); 
        Button v = new Button("V"); 
        Button b = new Button("B"); 
        Button n = new Button("N"); 
        Button m = new Button("M"); 
        Button op = new Button("<    ,"); 
        Button en = new Button(">    ."); 
        Button qu = new Button("?    /"); 
        Button sh = new Button("Shift"); 
        Button ctrl = new Button("Ctrl"); 
        Button fn = new Button("Fn"); 
        Button net = new Button("NET"); 
        Button alt = new Button("Alt"); 
        Button space = new Button("   "); 
        Button altgr = new Button("Alt");
        Button windows = new Button("Win");
        Button ct = new Button("Ctrl"); 
        Button le = new Button("<");
        Button up = new Button("^");
        Button dow = new Button("v"); 
        Button ri = new Button(">"); 
        Button del = new Button("Delete");
        
        
         esc.setMinSize(55, 50);
         axo.setMinSize(47, 50);
         k1.setMinSize(47, 50);
         k2.setMinSize(47, 50);
         k3.setMinSize(47, 50);
         k4.setMinSize(47, 50);
         k5.setMinSize(47, 50);
         k6.setMinSize(47, 50);
         k7.setMinSize(47, 50);
         k8.setMinSize(47, 50);
         k9.setMinSize(47, 50);
         k0.setMinSize(47, 50); 
         us.setMinSize(47, 50); 
         eqadd.setMinSize(47, 50);
         bs.setMinSize(103, 50); 
         tab.setMinSize(70, 50); 
         q.setMinSize(50, 50);
         w.setMinSize(50, 50); 
         ee.setMinSize(50, 50);
         r.setMinSize(50, 50); 
         t.setMinSize(50, 50);
         y.setMinSize(50, 50);
         u.setMinSize(50, 50);
         i.setMinSize(50, 50);
         o.setMinSize(50, 50);
         p.setMinSize(50, 50);
         pre.setMinSize(50, 50);
         epre.setMinSize(50, 50);
         capslock.setMinSize(95, 50);
         a.setMinSize(50, 50); 
         s.setMinSize(50, 50);
         d.setMinSize(50, 50);
         f.setMinSize(50, 50);
         g.setMinSize(50, 50); 
         h.setMinSize(50, 50);
         j.setMinSize(50, 50);
         k.setMinSize(50, 50);
         l.setMinSize(50, 50);
         sm.setMinSize(50, 50);
         pp.setMinSize(50, 50);
         pp1.setMinSize(50, 50);
         shift.setMinSize(125, 50);
         z.setMinSize(50, 50); 
         x.setMinSize(50, 50);
         c.setMinSize(50, 50);
         v.setMinSize(50, 50);
         b.setMinSize(50, 50);
         n.setMinSize(50, 50);
         m.setMinSize(50, 50);
         op.setMinSize(50, 50);
         en.setMinSize(50, 50);
         qu.setMinSize(50, 50);
         sh.setMinSize(102, 50);
         ent.setMinSize(132, 50);
         ctrl.setMinSize(50, 50);
         fn.setMinSize(45, 50); 
         net.setMinSize(50, 50); 
         alt.setMinSize(50, 50);
         space.setMinSize(264, 50); 
         altgr.setMinSize(50, 50); 
         windows.setMinSize(50, 50);
         ct.setMinSize(65, 50);
         le.setMinSize(55, 50);
         up.setMinSize(50, 50);
         dow.setMinSize(50, 50);
         ri.setMinSize(55, 50);
         del.setMinSize(50, 50);
         
         
         
         
         
         esc.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         axo.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         k1.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         k2.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         k3.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         k4.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         k5.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         k6.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         k7.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         k8.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         k9.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         k0.setStyle("-fx-background-color: black ; -fx-text-fill: white;"); 
         us.setStyle("-fx-background-color: black ; -fx-text-fill: white;"); 
         eqadd.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         bs.setStyle("-fx-background-color: black ; -fx-text-fill: white;"); 
         tab.setStyle("-fx-background-color: black ; -fx-text-fill: white;"); 
         q.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         w.setStyle("-fx-background-color: black ; -fx-text-fill: white;"); 
         ee.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         r.setStyle("-fx-background-color: black ; -fx-text-fill: white;"); 
         t.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         y.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         u.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         i.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         o.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         p.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         pre.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         epre.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         capslock.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         a.setStyle("-fx-background-color: black ; -fx-text-fill: white;"); 
         s.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         d.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         f.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         g.setStyle("-fx-background-color: black ; -fx-text-fill: white;"); 
         h.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         j.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         k.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         l.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         sm.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         pp.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         pp1.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         shift.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         z.setStyle("-fx-background-color: black ; -fx-text-fill: white;"); 
         x.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         c.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         v.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         b.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         n.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         m.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         op.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         en.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         qu.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         sh.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         ent.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         ctrl.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         fn.setStyle("-fx-background-color: black ; -fx-text-fill: white;"); 
         net.setStyle("-fx-background-color: black ; -fx-text-fill: white;"); 
         alt.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         space.setStyle("-fx-background-color: black ; -fx-text-fill: white;"); 
         altgr.setStyle("-fx-background-color: black ; -fx-text-fill: white;"); 
         windows.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         ct.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         le.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         up.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         dow.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         ri.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         del.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
         
       
         
    capslock.setOnAction( e -> {  
           ++cnt1;  
            if(cnt1 %2 == 0){
            
            capslock.setStyle("-fx-background-color: grey ; -fx-text-fill: white;");  
               
            q.setOnAction( e1 -> {  System.out.print( "Q"); } );
            w.setOnAction( e1 -> {  System.out.print( "W"); } ); 
            ee.setOnAction( e1 -> {  System.out.print( "E"); } );
            r.setOnAction( e1 -> {  System.out.print( "R"); } ); 
            t.setOnAction( e1 -> {  System.out.print( "T"); } );
            y.setOnAction( e1 -> {  System.out.print( "Y"); } );
            u.setOnAction( e1 -> {  System.out.print( "U"); } );
            i.setOnAction( e1 -> {  System.out.print( "I"); } );
            o.setOnAction( e1 -> {  System.out.print( "O"); } );
            p.setOnAction( e1 -> {  System.out.print( "P"); } );
            a.setOnAction( e1 -> {  System.out.print( "A"); } ); 
            s.setOnAction( e1 -> {  System.out.print( "S"); } );
            d.setOnAction( e1 -> {  System.out.print( "D"); } );
            f.setOnAction( e1 -> {  System.out.print( "F"); } );
            g.setOnAction( e1 -> {  System.out.print( "G"); } ); 
            h.setOnAction( e1 -> {  System.out.print( "H"); } );
            j.setOnAction( e1 -> {  System.out.print( "J"); } );
            k.setOnAction( e1 -> {  System.out.print( "K"); } );
            l.setOnAction( e1 -> {  System.out.print( "L"); } );
            z.setOnAction( e1 -> {  System.out.print( "Z"); } ); 
            x.setOnAction( e1 -> {  System.out.print( "X"); } );
            c.setOnAction( e1 -> {  System.out.print( "C"); } );
            v.setOnAction( e1 -> {  System.out.print( "V"); } );
            b.setOnAction( e1 -> {  System.out.print( "B"); } );
            n.setOnAction( e1 -> {  System.out.print( "N"); } );
            m.setOnAction( e1 -> {  System.out.print( "M"); } );
            }
           else{
               
            capslock.setStyle("-fx-background-color: black ; -fx-text-fill: white;");   
               
            q.setOnAction( e1 -> {  System.out.print( "q"); } );
            w.setOnAction( e1 -> {  System.out.print( "w"); } ); 
            ee.setOnAction( e1 -> {  System.out.print( "e"); } );
            r.setOnAction( e1 -> {  System.out.print( "r"); } ); 
            t.setOnAction( e1 -> {  System.out.print( "t"); } );
            y.setOnAction( e1 -> {  System.out.print( "y"); } );
            u.setOnAction( e1 -> {  System.out.print( "u"); } );
            i.setOnAction( e1 -> {  System.out.print( "i"); } );
            o.setOnAction( e1 -> {  System.out.print( "o"); } );
            p.setOnAction( e1 -> {  System.out.print( "p"); } );
            a.setOnAction( e1 -> {  System.out.print( "a"); } ); 
            s.setOnAction( e1 -> {  System.out.print( "s"); } );
            d.setOnAction( e1 -> {  System.out.print( "d"); } );
            f.setOnAction( e1 -> {  System.out.print( "f"); } );
            g.setOnAction( e1 -> {  System.out.print( "g"); } ); 
            h.setOnAction( e1 -> {  System.out.print( "h"); } );
            j.setOnAction( e1 -> {  System.out.print( "j"); } );
            k.setOnAction( e1 -> {  System.out.print( "k"); } );
            l.setOnAction( e1 -> {  System.out.print( "l"); } );
            z.setOnAction( e1 -> {  System.out.print( "z"); } ); 
            x.setOnAction( e1 -> {  System.out.print( "x"); } );
            c.setOnAction( e1 -> {  System.out.print( "c"); } );
            v.setOnAction( e1 -> {  System.out.print( "v"); } );
            b.setOnAction( e1 -> {  System.out.print( "b"); } );
            n.setOnAction( e1 -> {  System.out.print( "n"); } );
            m.setOnAction( e1 -> {  System.out.print( "m"); } );
            
           }
         } );
         
    shift.setOnAction( e -> {  
           ++cnt1;  
           if(cnt1 %2 == 0){
             
             shift.setStyle("-fx-background-color: grey ; -fx-text-fill: white;");  
              
            q.setOnAction( e1 -> {  System.out.print( "Q"); } );
            w.setOnAction( e1 -> {  System.out.print( "W"); } ); 
            ee.setOnAction( e1 -> {  System.out.print( "E"); } );
            r.setOnAction( e1 -> {  System.out.print( "R"); } ); 
            t.setOnAction( e1 -> {  System.out.print( "T"); } );
            y.setOnAction( e1 -> {  System.out.print( "Y"); } );
            u.setOnAction( e1 -> {  System.out.print( "U"); } );
            i.setOnAction( e1 -> {  System.out.print( "I"); } );
            o.setOnAction( e1 -> {  System.out.print( "O"); } );
            p.setOnAction( e1 -> {  System.out.print( "P"); } );
            a.setOnAction( e1 -> {  System.out.print( "A"); } ); 
            s.setOnAction( e1 -> {  System.out.print( "S"); } );
            d.setOnAction( e1 -> {  System.out.print( "D"); } );
            f.setOnAction( e1 -> {  System.out.print( "F"); } );
            g.setOnAction( e1 -> {  System.out.print( "G"); } ); 
            h.setOnAction( e1 -> {  System.out.print( "H"); } );
            j.setOnAction( e1 -> {  System.out.print( "J"); } );
            k.setOnAction( e1 -> {  System.out.print( "K"); } );
            l.setOnAction( e1 -> {  System.out.print( "L"); } );
            z.setOnAction( e1 -> {  System.out.print( "Z"); } ); 
            x.setOnAction( e1 -> {  System.out.print( "X"); } );
            c.setOnAction( e1 -> {  System.out.print( "C"); } );
            v.setOnAction( e1 -> {  System.out.print( "V"); } );
            b.setOnAction( e1 -> {  System.out.print( "B"); } );
            n.setOnAction( e1 -> {  System.out.print( "N"); } );
            m.setOnAction( e1 -> {  System.out.print( "M"); } );
           }
           else{
               
            shift.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
             
            q.setOnAction( e1 -> {  System.out.print( "q"); } );
            w.setOnAction( e1 -> {  System.out.print( "w"); } ); 
            ee.setOnAction( e1 -> {  System.out.print( "e"); } );
            r.setOnAction( e1 -> {  System.out.print( "r"); } ); 
            t.setOnAction( e1 -> {  System.out.print( "t"); } );
            y.setOnAction( e1 -> {  System.out.print( "y"); } );
            u.setOnAction( e1 -> {  System.out.print( "u"); } );
            i.setOnAction( e1 -> {  System.out.print( "i"); } );
            o.setOnAction( e1 -> {  System.out.print( "o"); } );
            p.setOnAction( e1 -> {  System.out.print( "p"); } );
            a.setOnAction( e1 -> {  System.out.print( "a"); } ); 
            s.setOnAction( e1 -> {  System.out.print( "s"); } );
            d.setOnAction( e1 -> {  System.out.print( "d"); } );
            f.setOnAction( e1 -> {  System.out.print( "f"); } );
            g.setOnAction( e1 -> {  System.out.print( "g"); } ); 
            h.setOnAction( e1 -> {  System.out.print( "h"); } );
            j.setOnAction( e1 -> {  System.out.print( "j"); } );
            k.setOnAction( e1 -> {  System.out.print( "k"); } );
            l.setOnAction( e1 -> {  System.out.print( "l"); } );
            z.setOnAction( e1 -> {  System.out.print( "z"); } ); 
            x.setOnAction( e1 -> {  System.out.print( "x"); } );
            c.setOnAction( e1 -> {  System.out.print( "c"); } );
            v.setOnAction( e1 -> {  System.out.print( "v"); } );
            b.setOnAction( e1 -> {  System.out.print( "b"); } );
            n.setOnAction( e1 -> {  System.out.print( "n"); } );
            m.setOnAction( e1 -> {  System.out.print( "m"); } );
            
           }
           
           ++cnt2;  
           if(cnt2 %2 == 0){
             
            axo.setOnAction( e1 -> {  System.out.print( "~"); } );
            k1.setOnAction( e1 -> {  System.out.print( "!"); } );
            k2.setOnAction( e1 -> {  System.out.print( "@"); } );
            k3.setOnAction( e1 -> {  System.out.print( "#"); } );
            k4.setOnAction( e1 -> {  System.out.print( "$"); } );
            k5.setOnAction( e1 -> {  System.out.print( "%"); } );
            k6.setOnAction( e1 -> {  System.out.print( "^"); } );
            k7.setOnAction( e1 -> {  System.out.print( "&"); } );
            k8.setOnAction( e1 -> {  System.out.print( "*"); } );
            k9.setOnAction( e1 -> {  System.out.print( "("); } );
            k0.setOnAction( e1 -> {  System.out.print( ")"); } ); 
            us.setOnAction( e1 -> {  System.out.print( "_"); } ); 
            eqadd.setOnAction( e1 -> {  System.out.print( "+"); } );
            pre.setOnAction( e1 -> {  System.out.print( "{"); } );
            epre.setOnAction( e1 -> {  System.out.print( "}"); } );
            pp1.setOnAction( e1 -> {  System.out.print( "|"); } );
            sm.setOnAction( e1 -> {  System.out.print( ":"); } );
            pp.setOnAction( e1 -> {  System.out.print( "''"); } );
            op.setOnAction( e1 -> {  System.out.print( "<"); } );
            en.setOnAction( e1 -> {  System.out.print( ">"); } );
            qu.setOnAction( e1 -> {  System.out.print( "?"); } );
            }
           else{
               
            axo.setOnAction( e1 -> {  System.out.print( "`"); } );
            k1.setOnAction( e1 -> {  System.out.print( "1"); } );
            k2.setOnAction( e1 -> {  System.out.print( "2"); } );
            k3.setOnAction( e1 -> {  System.out.print( "3"); } );
            k4.setOnAction( e1 -> {  System.out.print( "4"); } );
            k5.setOnAction( e1 -> {  System.out.print( "5"); } );
            k6.setOnAction( e1 -> {  System.out.print( "6"); } );
            k7.setOnAction( e1 -> {  System.out.print( "7"); } );
            k8.setOnAction( e1 -> {  System.out.print( "8"); } );
            k9.setOnAction( e1 -> {  System.out.print( "9"); } );
            k0.setOnAction( e1 -> {  System.out.print( "0"); } ); 
            us.setOnAction( e1 -> {  System.out.print( "-"); } ); 
            eqadd.setOnAction( e1 -> {  System.out.print( "="); } );
            pre.setOnAction( e1 -> {  System.out.print( "["); } );
            epre.setOnAction( e1 -> {  System.out.print( "]"); } );
            pp1.setOnAction( e1 -> {  System.out.print( "\\"); } );
            sm.setOnAction( e1 -> {  System.out.print( ";"); } );
            pp.setOnAction( e1 -> {  System.out.print( "'"); } );
            op.setOnAction( e1 -> {  System.out.print( ","); } );
            en.setOnAction( e1 -> {  System.out.print( "."); } );
            qu.setOnAction( e1 -> {  System.out.print( "/"); } );
           }
           
         } );
    
    sh.setOnAction( e -> {  
           ++cnt1;  
           if(cnt1 %2 == 0){
             
             sh.setStyle("-fx-background-color: grey ; -fx-text-fill: white;");  
              
            q.setOnAction( e1 -> {  System.out.print( "Q"); } );
            w.setOnAction( e1 -> {  System.out.print( "W"); } ); 
            ee.setOnAction( e1 -> {  System.out.print( "E"); } );
            r.setOnAction( e1 -> {  System.out.print( "R"); } ); 
            t.setOnAction( e1 -> {  System.out.print( "T"); } );
            y.setOnAction( e1 -> {  System.out.print( "Y"); } );
            u.setOnAction( e1 -> {  System.out.print( "U"); } );
            i.setOnAction( e1 -> {  System.out.print( "I"); } );
            o.setOnAction( e1 -> {  System.out.print( "O"); } );
            p.setOnAction( e1 -> {  System.out.print( "P"); } );
            a.setOnAction( e1 -> {  System.out.print( "A"); } ); 
            s.setOnAction( e1 -> {  System.out.print( "S"); } );
            d.setOnAction( e1 -> {  System.out.print( "D"); } );
            f.setOnAction( e1 -> {  System.out.print( "F"); } );
            g.setOnAction( e1 -> {  System.out.print( "G"); } ); 
            h.setOnAction( e1 -> {  System.out.print( "H"); } );
            j.setOnAction( e1 -> {  System.out.print( "J"); } );
            k.setOnAction( e1 -> {  System.out.print( "K"); } );
            l.setOnAction( e1 -> {  System.out.print( "L"); } );
            z.setOnAction( e1 -> {  System.out.print( "Z"); } ); 
            x.setOnAction( e1 -> {  System.out.print( "X"); } );
            c.setOnAction( e1 -> {  System.out.print( "C"); } );
            v.setOnAction( e1 -> {  System.out.print( "V"); } );
            b.setOnAction( e1 -> {  System.out.print( "B"); } );
            n.setOnAction( e1 -> {  System.out.print( "N"); } );
            m.setOnAction( e1 -> {  System.out.print( "M"); } );
            }
           else{
               
            sh.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
               
            q.setOnAction( e1 -> {  System.out.print( "q"); } );
            w.setOnAction( e1 -> {  System.out.print( "w"); } ); 
            ee.setOnAction( e1 -> {  System.out.print( "e"); } );
            r.setOnAction( e1 -> {  System.out.print( "r"); } ); 
            t.setOnAction( e1 -> {  System.out.print( "t"); } );
            y.setOnAction( e1 -> {  System.out.print( "y"); } );
            u.setOnAction( e1 -> {  System.out.print( "u"); } );
            i.setOnAction( e1 -> {  System.out.print( "i"); } );
            o.setOnAction( e1 -> {  System.out.print( "o"); } );
            p.setOnAction( e1 -> {  System.out.print( "p"); } );
            a.setOnAction( e1 -> {  System.out.print( "a"); } ); 
            s.setOnAction( e1 -> {  System.out.print( "s"); } );
            d.setOnAction( e1 -> {  System.out.print( "d"); } );
            f.setOnAction( e1 -> {  System.out.print( "f"); } );
            g.setOnAction( e1 -> {  System.out.print( "g"); } ); 
            h.setOnAction( e1 -> {  System.out.print( "h"); } );
            j.setOnAction( e1 -> {  System.out.print( "j"); } );
            k.setOnAction( e1 -> {  System.out.print( "k"); } );
            l.setOnAction( e1 -> {  System.out.print( "l"); } );
            z.setOnAction( e1 -> {  System.out.print( "z"); } ); 
            x.setOnAction( e1 -> {  System.out.print( "x"); } );
            c.setOnAction( e1 -> {  System.out.print( "c"); } );
            v.setOnAction( e1 -> {  System.out.print( "v"); } );
            b.setOnAction( e1 -> {  System.out.print( "b"); } );
            n.setOnAction( e1 -> {  System.out.print( "n"); } );
            m.setOnAction( e1 -> {  System.out.print( "m"); } );
           }
           
           
           ++cnt2;  
           if(cnt2 %2 == 0){
             
            axo.setOnAction( e1 -> {  System.out.print( "~"); } );
            k1.setOnAction( e1 -> {  System.out.print( "!"); } );
            k2.setOnAction( e1 -> {  System.out.print( "@"); } );
            k3.setOnAction( e1 -> {  System.out.print( "#"); } );
            k4.setOnAction( e1 -> {  System.out.print( "$"); } );
            k5.setOnAction( e1 -> {  System.out.print( "%"); } );
            k6.setOnAction( e1 -> {  System.out.print( "^"); } );
            k7.setOnAction( e1 -> {  System.out.print( "&"); } );
            k8.setOnAction( e1 -> {  System.out.print( "*"); } );
            k9.setOnAction( e1 -> {  System.out.print( "("); } );
            k0.setOnAction( e1 -> {  System.out.print( ")"); } ); 
            us.setOnAction( e1 -> {  System.out.print( "_"); } ); 
            eqadd.setOnAction( e1 -> {  System.out.print( "+"); } );
            pre.setOnAction( e1 -> {  System.out.print( "{"); } );
            epre.setOnAction( e1 -> {  System.out.print( "}"); } );
            pp1.setOnAction( e1 -> {  System.out.print( "|"); } );
            sm.setOnAction( e1 -> {  System.out.print( ":"); } );
            pp.setOnAction( e1 -> {  System.out.print( "''"); } );
            op.setOnAction( e1 -> {  System.out.print( "<"); } );
            en.setOnAction( e1 -> {  System.out.print( ">"); } );
            qu.setOnAction( e1 -> {  System.out.print( "?"); } );
            }
           else{
               
            axo.setOnAction( e1 -> {  System.out.print( "`"); } );
            k1.setOnAction( e1 -> {  System.out.print( "1"); } );
            k2.setOnAction( e1 -> {  System.out.print( "2"); } );
            k3.setOnAction( e1 -> {  System.out.print( "3"); } );
            k4.setOnAction( e1 -> {  System.out.print( "4"); } );
            k5.setOnAction( e1 -> {  System.out.print( "5"); } );
            k6.setOnAction( e1 -> {  System.out.print( "6"); } );
            k7.setOnAction( e1 -> {  System.out.print( "7"); } );
            k8.setOnAction( e1 -> {  System.out.print( "8"); } );
            k9.setOnAction( e1 -> {  System.out.print( "9"); } );
            k0.setOnAction( e1 -> {  System.out.print( "0"); } ); 
            us.setOnAction( e1 -> {  System.out.print( "-"); } ); 
            eqadd.setOnAction( e1 -> {  System.out.print( "="); } );
            pre.setOnAction( e1 -> {  System.out.print( "["); } );
            epre.setOnAction( e1 -> {  System.out.print( "]"); } );
            pp1.setOnAction( e1 -> {  System.out.print( "\\"); } );
            sm.setOnAction( e1 -> {  System.out.print( ";"); } );
            pp.setOnAction( e1 -> {  System.out.print( "'"); } );
            op.setOnAction( e1 -> {  System.out.print( ","); } );
            en.setOnAction( e1 -> {  System.out.print( "."); } );
            qu.setOnAction( e1 -> {  System.out.print( "/"); } ); 
           }
          
         } );
    
         
         tab.setOnAction( e -> {  System.out.print( "	"); } ); 
         space.setOnAction( e -> {  System.out.print( " "); } ); 
         //sh.setOnAction( e -> {  System.out.print( ""); } );
         ent.setOnAction( e -> {  System.out.println(""); } );
         ctrl.setOnAction( e -> {  System.out.print( ""); } );
         fn.setOnAction( e -> {  System.out.print( ""); } ); 
         net.setOnAction( e -> {  System.out.print( ""); } ); 
         alt.setOnAction( e -> {  System.out.print( ""); } );
         altgr.setOnAction( e -> {  System.out.print( ""); } ); 
         windows.setOnAction( e -> {  System.out.print( ""); } );
         ct.setOnAction( e -> {  System.out.print( ""); } );
         le.setOnAction( e -> {  System.out.print( ""); } );
         up.setOnAction( e -> {  System.out.print( ""); } );
         dow.setOnAction( e -> {  System.out.print( ""); } );
         ri.setOnAction( e -> {  System.out.print( ""); } );
         del.setOnAction( e -> {  System.out.print( ""); } );
         axo.setOnAction( e -> {  System.out.print( "`"); } );
            k1.setOnAction( e -> {  System.out.print( "1"); } );
            k2.setOnAction( e -> {  System.out.print( "2"); } );
            k3.setOnAction( e -> {  System.out.print( "3"); } );
            k4.setOnAction( e -> {  System.out.print( "4"); } );
            k5.setOnAction( e -> {  System.out.print( "5"); } );
            k6.setOnAction( e -> {  System.out.print( "6"); } );
            k7.setOnAction( e -> {  System.out.print( "7"); } );
            k8.setOnAction( e -> {  System.out.print( "8"); } );
            k9.setOnAction( e -> {  System.out.print( "9"); } );
            k0.setOnAction( e -> {  System.out.print( "0"); } ); 
            us.setOnAction( e -> {  System.out.print( "-"); } ); 
            eqadd.setOnAction( e -> {  System.out.print( "="); } );
            q.setOnAction( e -> {  System.out.print( "q"); } );
            w.setOnAction( e -> {  System.out.print( "w"); } ); 
            ee.setOnAction( e -> {  System.out.print( "e"); } );
            r.setOnAction( e -> {  System.out.print( "r"); } ); 
            t.setOnAction( e -> {  System.out.print( "t"); } );
            y.setOnAction( e -> {  System.out.print( "y"); } );
            u.setOnAction( e -> {  System.out.print( "u"); } );
            i.setOnAction( e -> {  System.out.print( "i"); } );
            o.setOnAction( e -> {  System.out.print( "o"); } );
            p.setOnAction( e -> {  System.out.print( "p"); } );
            pre.setOnAction( e -> {  System.out.print( "["); } );
            epre.setOnAction( e -> {  System.out.print( "]"); } );
            pp1.setOnAction( e -> {  System.out.print( "\\"); } );
            a.setOnAction( e -> {  System.out.print( "a"); } ); 
            s.setOnAction( e -> {  System.out.print( "s"); } );
            d.setOnAction( e -> {  System.out.print( "d"); } );
            f.setOnAction( e -> {  System.out.print( "f"); } );
            g.setOnAction( e -> {  System.out.print( "g"); } ); 
            h.setOnAction( e -> {  System.out.print( "h"); } );
            j.setOnAction( e -> {  System.out.print( "j"); } );
            k.setOnAction( e -> {  System.out.print( "k"); } );
            l.setOnAction( e -> {  System.out.print( "l"); } );
            sm.setOnAction( e -> {  System.out.print( ";"); } );
            pp.setOnAction( e -> {  System.out.print( "'"); } );
            z.setOnAction( e -> {  System.out.print( "z"); } ); 
            x.setOnAction( e -> {  System.out.print( "x"); } );
            c.setOnAction( e -> {  System.out.print( "c"); } );
            v.setOnAction( e -> {  System.out.print( "v"); } );
            b.setOnAction( e -> {  System.out.print( "b"); } );
            n.setOnAction( e -> {  System.out.print( "n"); } );
            m.setOnAction( e -> {  System.out.print( "m"); } );
            op.setOnAction( e -> {  System.out.print( ","); } );
            en.setOnAction( e -> {  System.out.print( "."); } );
            qu.setOnAction( e -> {  System.out.print( "/"); } );
        
         
        
        
        //HBox h1 = new HBox(f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12);       
        HBox h2 = new HBox(esc,axo,k1,k2,k3,k4,k5,k6,k7,k8,k9,k0,us,eqadd,bs);      
        HBox h3 = new HBox(tab,q,w,ee,r,t,y,u,i,o,p,pre,epre,pp1,del);     
        HBox h4 = new HBox(capslock,a,s,d,f,g,h,j,k,l,sm,pp,ent);         
        HBox h5 = new HBox(shift,z,x,c,v,b,n,m,op,en,qu,up,sh);         
        HBox h6 = new HBox(ctrl,net,alt,space,altgr,windows,ct,le,dow,ri,fn); 
        //h1.setSpacing(3);  
        h2.setSpacing(3);    
        h3.setSpacing(3);    
        h4.setSpacing(3);    
        h5.setSpacing(3);    
        h6.setSpacing(3);
        
        VBox R5 = new VBox(h2,h3,h4,h5,h6);
        R5.setSpacing(3);
        
        // Set up borderpane 
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(15));
        root.setLeft(R5);
        root.setRight(h111);
        //root.setTop(h1);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("KeyBoard");
        stage.show();
    
    }


   public static void main(String args[]){ 
      launch(args); 
   } 
}


