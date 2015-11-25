<?php
/**
 * Problem: I've Been Everywhere, Man
 * https://open.kattis.com/problems/everywhere
 *
 * @author   Martin Björling
 * @email    martinbjorling@gmail.com
 * @version  1.0
 * @since    2015-11-25
 */

$answers = [];

$numOfTestCases = stream_get_line(STDIN, 1024, PHP_EOL);

for ($i = 0; $i < $numOfTestCases; $i++) {
	$numOfWorkTrips = stream_get_line(STDIN, 1024, PHP_EOL);

	$cities = [];
 
	for ($j = 0; $j < $numOfWorkTrips; $j++) {
		$nextCity = stream_get_line(STDIN, 1024, PHP_EOL);

		if (!in_array($nextCity, $cities)) {
			$cities[] = $nextCity;
		}
	}

 	$answers[] = count($cities) . "\n";
}

foreach ($answers as $value) {
	fwrite(STDOUT, $value);
}


?>