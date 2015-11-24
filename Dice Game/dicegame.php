<?php
	/**
	 * Ladder by Martin Björling, 
	 * martinbjorling@gmail.com, 0737565044
	 *
	 * @author   Martin Björling
	 * @version  1.0
	 * @since    2015-11-04
	 */

	$inputString1 = stream_get_line(STDIN, 1024, PHP_EOL);
	$inputArr1 = explode(" ", $inputString1);

	$gunnar1Low = $inputArr1[0];
	$gunnar1High = $inputArr1[1];
	$gunnar2Low = $inputArr1[2];
	$gunnar2High = $inputArr1[3];

	$inputString2 = stream_get_line(STDIN, 1024, PHP_EOL);
	$inputArr2 = explode(" ", $inputString2);

	$emma1Low = $inputArr2[0];
	$emma1High = $inputArr2[1];
	$emma2Low = $inputArr2[2];
	$emma2High = $inputArr2[3];

	$gunnarMin = $gunnar1Low + $gunnar2Low;
	$gunnarMax = $gunnar1High + $gunnar2High;

	$emmaMin = $emma1Low + $emma2Low;
	$emmaMax = $emma1High + $emma2High;

	$minDiff = $gunnarMin - $emmaMin;
	$maxDiff = $gunnarMax - $emmaMax;

	$prob = $maxDiff + $minDiff;

	if ($prob > 0) {
		$answer = "Gunnar";
	} else if ($prob < 0) {
		$answer = "Emma";
	} else {
		$answer = "Tie";
	}

	fwrite(STDOUT, "".$answer);
	

?>