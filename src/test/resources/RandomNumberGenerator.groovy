import java.util.Random;

Random rand = new Random();

int max = 2000;
int min = 1000;

int out = rand.nextInt(max+1);

if (out < min) {
	out = out + min;
}

message.setSessionProperty("randomid", out);

return payload;