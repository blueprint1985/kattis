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