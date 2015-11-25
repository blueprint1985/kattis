<?php
/**
 * Problem: Symmetric Order
 * https://open.kattis.com/problems/symmetricorder
 *
 * @author   Martin Björling
 * @email    martinbjorling@gmail.com
 * @version  1.0
 * @since    2015-11-24
 */

$answers = [];

$caseCounter = 1;

while(true) {
	$inputString = stream_get_line(STDIN, 1024, PHP_EOL);

	if ($inputString == "0") break;

	$nameAmount = $inputString;

	$names = [];

	$lowCounter = 0;
	$highCounter = $nameAmount - 1;

	$answers[] = "SET ".$caseCounter."\n";
	$caseCounter++;

	for ($i = 0; $i < $nameAmount; $i++) {
		if ($i % 2 == 0) {
			$names[$lowCounter] = stream_get_line(STDIN, 1024, PHP_EOL)."\n";
			$lowCounter++;
		} else {
			$names[$highCounter] = stream_get_line(STDIN, 1024, PHP_EOL)."\n";
			$highCounter--;
		}
	}

	for ($i = 0; $i < $nameAmount; $i++) {
		$answers[] = $names[$i];
	}
}

foreach ($answers as $value) {
	fwrite(STDOUT, $value);
}

?>