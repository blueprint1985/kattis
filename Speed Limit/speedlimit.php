<?php
/**
 * Problem: Speed Limit
 * https://open.kattis.com/problems/eligibility
 *
 * @author   Martin Björling
 * @email    martinbjorling@gmail.com
 * @version  1.0
 * @since    2015-11-24
 */

$answers = [];

$i = 0;
$totDist = 0;
$time = 0;

while (true) {
	$inputString = stream_get_line(STDIN, 1024, PHP_EOL);

	$inputArr = explode(" ", $inputString);

	if (count($inputArr) == 1) {
			if ($i == 1) $answers[] = $totDist." miles\n";
			if ($inputString == "-1") break;
			$i = 1;
			$totDist = 0;
			$time = 0;
		} else {
			$speed = $inputArr[0];
			$currTime = $inputArr[1];
			$driveTime = $currTime - $time;
			$dist = $speed * $driveTime;
			$time = $currTime;
			$totDist = $totDist + $dist;
		}
}

foreach ($answers as $value) {
	fwrite(STDOUT, $value);
}


?>