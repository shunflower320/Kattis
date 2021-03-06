import java.util.Scanner;

class Main {
    public static int indexOf(int[] arr, int e, int start) {
        for (int k = start; k < arr.length; k++) {
            if (arr[k] == e) {
                return k;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arrows = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int height = arr[0];
        int index = indexOf(arr, height - 1, 1);

        while (height != arr[arr.length - 1] || index > 0) {
            int start = 1;
            int index = indexOf(arr, height - 1, start);
                height--;
                arr[index] = -1;
                start = index + 1;
                index = indexOf(arr, height - 1, start);
            }

            if (height > 0) {
                arrows++;
            }
        if (height == n - 1 && height == 0) {
            break;
        } else if (j == n - 1 && height > 0) {
            arrows++;
            break;
        }
            int start = j + 1;
            int index = indexOf(arr, height - 1, start);
            while (index > 0) {
                height--;
                arr[index] = -1;
                start = index + 1;
                index = indexOf(arr, height - 1, start);
            }

            if (height > 0) {
                arrows++;
            }
        }
        System.out.println(arrows);
    }
    }
