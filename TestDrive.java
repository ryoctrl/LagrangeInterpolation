
public class TestDrive {
	public static void main(String[] args){
		Datas datas = new Datas();

		datas.addData(2.5, 0.9163);
		datas.addData(2.6, 0.9555);
		datas.addData(2.7, 0.9933);
		datas.addData(2.8, 1.0296);
		datas.addData(2.9, 1.0647);


		datas.showDataList();

		System.out.printf("%.4f",datas.Calclate(2.77, 4));
	}
}
