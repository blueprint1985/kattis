<?php
/**
 * ACM by Martin Björling, 
 * martinbjorling@gmail.com, 0737565044
 *
 * Problem: ACM Contest Scoring
 * https://open.kattis.com/problems/acm
 *
 * @author   Martin Björling
 * @email    martinbjorling@gmail.com
 * @version  1.0
 * @since    2015-11-24
 */

$problemsSolved = 0;
$minutesResult = 0;

$wrongString = "";

while (true) {
	$inputString = stream_get_line(STDIN, 1024, PHP_EOL);

	if ($inputString == "-1") break;

	$inputArr = explode(" ", $inputString);

	$ansTime = $inputArr[0];
	$ansResult = $inputArr[2];

	if ($ansResult == "right") {
		$problemsSolved++;

		$counter = 0;
		for($i = 0; $i < strlen($wrongString); $i++) {
			if ($wrongString[$i] == $inputArr[1]) {
				$counter++;
			} 
		}

		$minutesResult = $minutesResult + $counter*20 + $ansTime;
	} else {
		$wrongString .= $inputArr[1];
	}
}

if ($problemsSolved == 0) $minutesResult = 0;

fwrite(STDOUT, $problemsSolved." ".$minutesResult);

?>