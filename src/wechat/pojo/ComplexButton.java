package wechat.pojo;
/** 
 * ���Ӱ�ť������ť�� 
 *�Ը��˵���Ķ��壺�����ж����˵����һ���˵���
 *����˵�������ж������ԣ�name��sub_button����sub_button����һ���Ӳ˵������顣
 */  
public class ComplexButton extends Button {  
    private Button[] sub_button;  
  
    public Button[] getSub_button() {  
        return sub_button;  
    }  
  
    public void setSub_button(Button[] sub_button) {  
        this.sub_button = sub_button;  
    }  
}  