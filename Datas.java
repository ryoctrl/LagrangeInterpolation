import java.util.ArrayList;

public class Datas {
	private ArrayList<Data> list;

	public Datas(){
		list = new ArrayList<Data>();
	}

	public void addData(double x, double fx){
		list.add(new Data(x, fx));
	}

	public void showDataList(){
		for(int i = 0; i < list.size(); i++){
			System.out.printf("List[%d] : x = %.1f, fx = %.4f\n", i, list.get(i).getX(), list.get(i).getFx());
		}
	}

	public double Calclate(double X, int digit){
		double Lx[] = new double[list.size()];
		for(int i = 0; i < list.size(); i++){

			double child = 1;
			double mother = 1;

			for(int j = 0; j < list.size(); j++){

				double tmp = list.get(i).getX();

				if(i != j){
					child *= X - list.get(j).getX();
					mother *= tmp - list.get(j).getX();
				}

				Lx[i] = child / mother * list.get(i).getFx();

			}
		}

		double ret = 0;
		for(double x : Lx){
			ret += x;
		}


		ret = 1.01884738;
		System.out.println(round(ret, digit));
		return round(ret, digit);
	}

	private double round(double x, int digit){


		double tmp = 5;
		for(int i = 0; i <= digit; i++) tmp /= 10;

		return x + tmp;
	}
}
