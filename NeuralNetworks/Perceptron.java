import java.util.Arrays;

public class Perceptron {
	
	int threshold;
	int learning;
	int[] weights;
	int bias;
	int yhat;
	int error;
	int index;
	public Perceptron(int in, int thresh, int learn)
	{
		threshold = thresh;
		learning = learn;
		weights = new int[in];
		bias = 0;
		index = 0;
		System.out.println("Initial weights: " + Arrays.toString(weights));
		System.out.println("Initial bias: " + bias);
		System.out.println("Threshold: " + threshold);
		System.out.println("Learning rate: " + learning);
	}
	
	
	public int predict(int[] inputs)
	{
		int z = 0;
		int activation;
		for (int i = 0; i < inputs.length; i++)
		{
			z+= inputs[i] * weights[i];
		}
		z+= bias;
		System.out.println("z = " + inputs[0] + "*" + weights[0] + "+" + inputs[1] + "*" + weights[1] + "=" + z);
		if (z > 0)
			activation = 1;
		else
			activation = 0;
		return activation;
		
	}
	
	public void train(int[][] traininputs, int[] labels)
	{
		for (int i = 0; i < threshold; i++)
		{
			System.out.println("------------Training Iteration: " + i + "--------------");
			for (int inputs = 0; inputs < traininputs.length-1; inputs++, index++)
			{
				if (index == weights.length)
					index = 0;
				System.out.println("Current inputs, weights, bias: " + Arrays.toString(traininputs[inputs]) + " " + Arrays.toString(weights) + " " + bias);
				weights[index] += learning * error * inputs;
				yhat = predict(traininputs[inputs]);
				System.out.println("Activation(yhat) = " + yhat);
				error = labels[inputs] - yhat;
				System.out.println("Error = " + labels[0] + "-" + yhat + "=" + error);
				
			}
			bias += learning * error;
			System.out.println("Updated weights " + Arrays.toString(weights));
			System.out.println("Updated bias " + bias);
		}
	}
}
