package javaPractise;


public class PaintJob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int area = (int)(Math.ceil((3.7d * 2.5d)/1.5));
		// System.out.println(area);
		System.out.println(getBucketCount(3.7, 2.5, 1.5, 2));
		System.out.println(getBucketCount(7.25, 4.3, 2.35));
		System.out.println(getBucketCount(3.26, 0.75));

	}

	public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
		if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0)
			return -1;

		double areaCalculated = height * width;
		int bucketRequired = (int) Math.ceil((areaCalculated / areaPerBucket));
		int getBucketCount = bucketRequired - extraBuckets;
		return getBucketCount;
	}

	public static int getBucketCount(double width, double height, double areaPerBucket) {
		if (width <= 0 || height <= 0 || areaPerBucket <= 0)
			return -1;
		double areaCalculated = height * width;
		int bucketRequired = (int) Math.ceil((areaCalculated / areaPerBucket));
		return bucketRequired;
	}

	public static int getBucketCount(double area,double areaPerBucket) {
		if (area <= 0 || areaPerBucket <= 0)
			return -1;
		
		int bucketRequired = (int) Math.ceil((area / areaPerBucket));
		return bucketRequired;
	
	}
}