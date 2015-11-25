<?php
/**
 * Problem: The Easiest Problem Is This One
 * https://open.kattis.com/problems/easiest
 *
 * @author   Martin Björling
 * @email    martinbjorling@gmail.com
 * @version  1.0
 * @since    2015-11-24
 */

$answers = [];

while (true) {
	$inputString = stream_get_line(STDIN, 1024, PHP_EOL);

	if ($inputString == "0") break;

	$inputSum = 0;

	$inputArr = str_split($inputString);

	for ($i = 0; $i < count($inputArr); $i++) {
		$inputSum += $inputArr[$i];
	}

	$k = 11;

	while (true) {
		$sumOfMult = $inputString * $k;

		$multSum = 0;

		$multArr = str_split($sumOfMult);

		for ($l = 0; $l < count($multArr); $l++) {
			$multSum += $multArr[$l];
		}

		if ($multSum == $inputSum) {
			$answers[] = $k."\n";
			break;
		}

		$k++;
	}
    
}

foreach ($answers as $value) {
	fwrite(STDOUT, $value);
}


?>