<?php
	/**
	 * Ladder by Martin Björling, 
	 * martinbjorling@gmail.com, 0737565044
	 *
	 * @author   Martin Björling
	 * @version  1.0
	 * @since    2015-11-04
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