<?php
/**
 * Problem: Billiard
 * https://open.kattis.com/problems/billiard
 *
 * @author   Martin Björling
 * @email    martinbjorling@gmail.com
 * @version  1.0
 * @since    2015-11-24
 */

$answers = [];

while (true) {
	$inputString = stream_get_line(STDIN, 1024, PHP_EOL);

	if ($inputString == "0 0 0 0 0") break;

	$inputArr = explode(" ", $inputString);

	$a = $inputArr[0];
	$b = $inputArr[1];
	$s = $inputArr[2];
	$m = $inputArr[3];
	$n = $inputArr[4];

	$sideH = $a * $m;
    $sideV = $b * $n;
    $sideC = sqrt($sideH * $sideH + $sideV * $sideV);
    $angle = rad2deg(acos($sideH / $sideC));

    $printAngle = sprintf("%0.2f",$angle);
    $printTime = sprintf("%0.2f",$sidec/$s);

    $answers[] = $printAngle." ".$printTime."\n";

    
}

foreach ($answers as $value) {
	fwrite(STDOUT, $value);
}


?>