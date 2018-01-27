import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P103 {
    public static void main(String[] args) {
        int [] metadata = new int[2];
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            metadata[0] = sc.nextInt();
            metadata[1] = sc.nextInt();
            Box[] boxes = new Box[metadata[0]];
            for(int i= 0; i<boxes.length; i++){
                int [] dimensions = new int[metadata[1]];
                for(int j = 0; j<dimensions.length; j++)
                    dimensions[j] = sc.nextInt();
                boxes[i] = new Box(i+1, dimensions);
            }

            // sort boxes based on dimensions
            Arrays.sort(boxes, (a, b) -> {
                for(int i=0; i<a.getDimensions().length; i++)
                    if(a.getDimensions()[i] == b.getDimensions()[i])
                            continue;
                        else
                            return Integer.compare(a.getDimensions()[i], b.getDimensions()[i]);
                return 0;
            });

            for (Box box : boxes)
                System.out.println(box.toString());
            printMaxNestedSeq(boxes);
        }

    }

    private static void printMaxNestedSeq(Box[] boxes){




//        ArrayList<Integer> seqIndexes = new ArrayList<>();
//        int maxSeq = 1;
//        for(int i=0; i<boxes.length-1; i++){
//            for(int j= i+1; j<boxes.length; j++){
//                if(isFitted(boxes[i].getDimensions(), boxes[j].getDimensions())){
//                    if(!(seqIndexes.contains(boxes[i].getName())
//                            &&seqIndexes.contains(boxes[j].getName()))) {
//                        seqIndexes.add(boxes[i].getName());
//                        seqIndexes.add(boxes[j].getName());
//                    }
//                    maxSeq++;
//                    i = j;
//                    break;
//                }
//            }
//        }
//        System.out.println(seqIndexes.toString());
//        System.out.println(maxSeq);

//        ArrayList<ArrayList<Integer>> allSequences = new ArrayList<>();
//        ArrayList<Integer> currentSequence = new ArrayList<>();
//        int sequenceLength = 0;
//        int currentIndex;
//        for(int i=0; i<boxes.length; i++){
//            sequenceLength++;
//            currentSequence.add(boxes[i].getName());
//            currentIndex = i;
//            for(int j=currentIndex+1; j<boxes.length; j++){
//                if(isFitted(boxes[currentIndex].getDimensions(), boxes[j].getDimensions())){
//                    currentSequence.add(boxes[j].getName());
//                    sequenceLength++;
//                    currentIndex = j;
//                }
//            }
//            currentSequence.add(sequenceLength);
//            sequenceLength = 0;
//            ArrayList<Integer> currentSequenceCopy = new ArrayList<>(currentSequence);
//            allSequences.add(currentSequenceCopy);
//            currentSequence.clear();
//        }
//
//        ArrayList<Integer> maxSeq = new ArrayList<>();
//        int max = 0;
//        for (ArrayList<Integer> allSequence : allSequences) {
//            if (max < allSequence.get(allSequence.size() - 1)) {
//                max = allSequence.get(allSequence.size() - 1);
//                maxSeq = allSequence;
//            }
//        }
//        System.out.println(maxSeq.get(maxSeq.size()-1));
//        for(int i=0; i<maxSeq.size()-1; i++)
//            System.out.print(maxSeq.get(i)+" ");
    }

    private static boolean isFitted(int[] a, int[] b){
        for(int i=0; i<a.length; i++)
            if(a[i] >= b[i])
                return false;
        return true;
    }

    static class Box{
        int[] dimensions;
        int name;

        Box(int name, int[] dimensions){
            this.name = name;
            Arrays.sort(dimensions);
            this.dimensions = dimensions;
        }

        private int[] getDimensions() {
            return dimensions;
        }

        public void setDimensions(int[] dimensions) {
            this.dimensions = dimensions;
        }

        private int getName() {
            return name;
        }

        public void setName(int name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Box{" +
                    "dimensions=" + Arrays.toString(dimensions) +
                    ", name=" + name +
                    '}';
        }
    }
}
