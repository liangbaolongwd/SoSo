package cn.soso.entity;
/**
 * ���ƶ����ײ�
 * @author ��������
 *
 */
public abstract class ServicePackage {
	//protected String name;  //�ײ�����
	protected double price;  //�ײ����ʷ�(Ԫ)
    /*public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}*/

	
    
    public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	//��ʾ�ײ�����
    public abstract void showInfo();
}
