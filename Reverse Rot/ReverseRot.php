<?php
/**
 * Problem: Reverse Rot
 * https://open.kattis.com/problems/reverserot
 *
 * @author   Martin Björling
 * @email    martinbjorling@gmail.com
 * @version  1.0
 * @since    2015-11-25
 */

$answers = [];

$alphabet = str_split("ABCDEFGHIJKLMNOPQRSTUVWXYZ_.");

while (true) {
	$inputString = stream_get_line(STDIN, 1024, PHP_EOL);

	if ($inputString == "0") break;

	$inputArr = explode(" ", $inputString);

	$stringArr = str_split($inputArr[1]);

	$returnStr = "";

	$rotation = $inputArr[0];

	for ($i = 0; $i < count($stringArr); $i++) {
		$curr = $inputArr[1][$i];

		$currPos = array_search($curr, $alphabet);

		$newPos = -1;

		if ($currPos > count($alphabet)-1-$rotation) {
			$newPos = $currPos + $rotation - count($alphabet);
			$returnStr .= $alphabet[$newPos];
		} else {
			$newPos = $currPos + $rotation;
			$returnStr .= $alphabet[$newPos];
		}
	}

	$answers[] = strrev($returnStr)."\n";
    
}

foreach ($answers as $value) {
	fwrite(STDOUT, $value);
}


?>