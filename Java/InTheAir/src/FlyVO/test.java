package FlyVO;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
class Queue {
    int max;
    ArrayList<String> queue;
    
    // 큐 정의
    public Queue(int max) {
        this.max=max;
        queue=new ArrayList<>(max);
    }
    
    
    // 큐 삽입 
    public void enqueue(String e) {
        if(!is_full()) 
            queue.add(e);
        else
            System.out.println("큐가 꽉 찼음!");
    }
    
    // 큐 삭제 
    public String dequeue() {
        if(!is_empty()) {
            String r=queue.get(0);
            queue.remove(0);
            return r;
        }
        else {
            System.out.println("큐가 비었음!");
            return null;
        }
    }
    
    // 큐가 비었는지 확인 
    public boolean is_empty() {
        if(queue.size()==0)
            return true;
        else
            return false;
    }
    
    // 큐가 꽉 찼는지 확인 
    public boolean is_full() {
        if(queue.size()==max)
            return true;
        else
            return false;
    }
    
    // 큐 사이즈 보내기
    public int size() {
        return queue.size();
    }
    
    // 큐 아이템 전체 보내기
	/*
	 * public String[] pass() { String[] r=new String[queue.size()]; for(int i=0;
	 * i<queue.size(); i++) {
	 * 
	 * if(j=0) {
	 * 
	 * } r[i]=; } return r; }
	 */
}
public class test extends JFrame{
    JTextField[] box=new JTextField[3];
    Font font1 = new Font("SansSerif", Font.BOLD, 30);
    
    public test() {
         setTitle("Roulette");
         setSize(400,300);
         setLocation(700,300);
         setLayout(new GridLayout(3,1));
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         
         for(int i=0; i<3; i++) {
             box[i]=new JTextField(15);
             box[i].setFont(font1);
             box[i].setForeground(new Color(128,128,128));
             if(i==1) { 
                 box[i].setForeground(Color.black);
                 box[i].setBackground(new Color(123,211,247));}
             box[i].setEditable(false);
             add(box[i]);
         }         
         
         setVisible(true);
    }
    
    public static void main(String[] args) {
        test t=new test();
        JTextField[] box=t.box;
        int random=(int)(Math.random()*150+50);
        
        Queue q1=new Queue(10);
        Queue q2=new Queue(3);
        
        for(int i=0; i<q1.max; i++)
            q1.enqueue(i+"");
        
        for(int i=0; i<q2.max; i++) {
            String r=q1.dequeue();
            q2.enqueue(r);
        }
        
       /* for(int i=0; i<random; i++) {
             try {
                Thread.sleep(10+(i+=2)); // 0.01초부터 (0.1x)초로 서서히 딜레이 
                String[] qdata=q2.pass();
                for(int j=0; j<3; j++) 
                    box[j].setText(qdata[2-j]);
             } 
             
             catch (InterruptedException e) {
                // TODO Auto-generated catch block
             }
            String r=q2.dequeue();
            q1.enqueue(r);
            String r2=q1.dequeue();
            q2.enqueue(r2);
        }
        */
    }
}