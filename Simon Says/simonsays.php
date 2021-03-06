<?php
/**
 * Problem: Simon Says
 * https://open.kattis.com/problems/simonsays
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

	$testCaseArr = explode(" ", $testCase);

	if ($testCaseArr[0] == "Simon" && $testCaseArr[1] == "says") {
		$returnStr = "";

		for ($k = 2; $k < count($testCaseArr); $k++) {
			if ($k != 2) $returnStr .= " ";

			$returnStr .= $testCaseArr[$k];
		}

		$answers[] = $returnStr . "\n";
	} 
}

foreach ($answers as $value) {
	fwrite(STDOUT, $value);
}


?>