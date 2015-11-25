<?php
/**
 * Problem: Eligibility
 * https://open.kattis.com/problems/eligibility
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

	$psStudiesArr = explode("/", $testCaseArr[1]);

	if ($psStudiesArr[0] >= 2010) {
		$answers[] = $testCaseArr[0] . " eligible\n";
	} else {
		$birthArr = explode("/", $testCaseArr[2]);

		if ($birthArr[0] >= 1991) {
			$answers[] = $testCaseArr[0] . " eligible\n";
		} else {
			if ($testCaseArr[3] > 40) {
				$answers[] = $testCaseArr[0] . " ineligible\n";
			} else {
				$answers[] = $testCaseArr[0] . " coach petitions\n";
			}
		}
	}
}

foreach ($answers as $value) {
	fwrite(STDOUT, $value);
}


?>