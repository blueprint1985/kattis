<?php
/**
 * Problem: Phone List
 * https://open.kattis.com/problems/phonelist
 *
 * @author   Martin Björling
 * @email    martinbjorling@gmail.com
 * @version  1.0
 * @since    2015-11-24
 */

$answers = [];

$numOfTestCases = stream_get_line(STDIN, 1024, PHP_EOL);

for ($i = 0; $i < $numOfTestCases; $i++) {
	$numOfPhoneNumbers = stream_get_line(STDIN, 1024, PHP_EOL);

	$numbers = [];
 
	for ($j = 0; $j < $numOfPhoneNumbers; $j++) {
		$numbers[] = stream_get_line(STDIN, 1024, PHP_EOL);
	}

	sort($numbers, SORT_STRING);
 	$isConsistent = true;

 	for ($j = 0; $j < $numOfPhoneNumbers-1; $j++) {
 		if (strncmp($numbers[$j], $numbers[$j+1], strlen($numbers[$j])) === 0) {
 			$isConsistent = false;
 			break;
 		}
 	}

 	$answers[] = ($isConsistent) ? "YES\n" : "NO\n";
}

foreach ($answers as $value) {
	fwrite(STDOUT, $value);
}


?>