public class demenagement {
	public static void main(String[] args) {

		int nb_carton_old = 34, nb_carton_camion = 0, nb_carton_new = 0;

		while (nb_carton_old > 0) {
			while (nb_carton_old > 0 && nb_carton_camion < 9) {
				nb_carton_old -= 1;
				nb_carton_camion += 1;
			}
			System.out.println("Un voyage de " + nb_carton_camion + " cartons.");
			while (nb_carton_camion > 0) {
				nb_carton_camion -= 1;
				nb_carton_new += 1;
			}
			System.out.println(nb_carton_new + " nouveaux cartons dans le nouveau bureau");
		}
	}
}
