<?php
	/**
	 * Phone List by Martin Björling, 
	 * martinbjorling@gmail.com, 0737565044
	 *
	 * Note that this program does not check
	 * input for unlawful input as my other 
	 * programs does because I was not sure 
	 * if it had any effect on the run time.
	 *
	 * @author   Martin Björling
	 * @version  5.4
	 * @since    2015-03-27
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