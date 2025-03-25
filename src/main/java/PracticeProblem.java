public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void selectionSortName(String[]names, int[]ages){
		for(int i = 0; i < names.length; i++){
			int smallest = i;
			for(int j = i+1; j < names.length; j++){
				if(names[j].compareToIgnoreCase(names[smallest]) < 0){
					smallest = j;
				}
			}
			String temp = names[smallest];
			names[smallest] = names[i];
			names[i] = temp;
			int agesTemp = ages[smallest];
			ages[smallest] = ages[i];
			ages[i] = agesTemp;
		}
	}

	public static void selectionSortAge(String[] names, int[] ages){
		for(int i = 0; i < ages.length; i++){
			int smallest = i;
			for(int j = i+1; j < ages.length; j++){
				if(ages[j] < ages[smallest]){
					smallest = j;
				}
			}
			int agesTemp = ages[smallest];
			ages[smallest] = ages[i];
			ages[i] = agesTemp;
			String temp = names[smallest];
			names[smallest] = names[i];
			names[i] = temp;
		}
	}

}
