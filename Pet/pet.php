<?php
/**
 * Problem: Pet
 * https://open.kattis.com/problems/pet
 *
 * @author   Martin Björling
 * @email    martinbjorling@gmail.com
 * @version  1.0
 * @since    2015-11-24
 */

$maxRes = 0;
$maxcont = 0;

for ($i = 0; $i < 5; $i++) {
	$inputString = stream_get_line(STDIN, 1024, PHP_EOL);

	$inputArr = explode(" ", $inputString);

	$thisRes = 0;

	for ($j = 0; $j < 4; $j++) {
		$thisRes += $inputArr[$j];
	}

	if ($thisRes > $maxRes) {
		$maxRes = $thisRes;
		$maxCont = $i + 1;
	}
	
}

$answer = $maxCont . " " . $maxRes;

fwrite(STDOUT, $answer);


?>