<?php
/**
 * Problem: Oddities
 * https://open.kattis.com/problems/oddities
 *
 * @author   Martin Björling
 * @email    martinbjorling@gmail.com
 * @version  1.0
 * @since    2015-11-24
 */

$answers = [];

$numOfTestCases = stream_get_line(STDIN, 1024, PHP_EOL);

for ($i = 0; $i < $numOfTestCases; $i++) {
	$testCase = stream_get_line(STDIN, 1024, PHP_EOL);

	if ($testCase % 2 == 0) $answers[] = $testCase . " is even\n";
	else $answers[] = $testCase . " is odd\n";
}

foreach ($answers as $value) {
	fwrite(STDOUT, $value);
}


?>