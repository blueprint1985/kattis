<?php
/**
 * Problem: Toilet Seat
 * https://open.kattis.com/problems/toilet
 *
 * @author   Martin Björling
 * @email    martinbjorling@gmail.com
 * @version  1.0
 * @since    2015-11-24
 */

$inputString = stream_get_line(STDIN, 1024, PHP_EOL);

$sequence = str_split($inputString);

$policy1 = 0;
$policy2 = 0;
$policy3 = 0;
$lastpos = "";

foreach ($sequence as $key => $value) {
	if ($key == 0) {
		$lastpos = $value;
	} elseif ($key == 1) {
		if ($value != $lastpos) {
			$policy1++;
			$policy2++;
			$policy3++;
		}
		if ($value == "D") $policy1++;
		if ($value == "U") $policy2++;
		$lastpos = $value;
	} else {
		if ($value == "D") $policy1 += 2;
		if ($value == "U") $policy2 += 2;
		if ($value != $lastpos) $policy3++;
		$lastpos = $value;
	}
}

$answer = $policy1."\n".$policy2."\n".$policy3;

fwrite(STDOUT, $answer);


?>
