<?php
/**
 * Problem: Mixed Fractions
 * https://open.kattis.com/problems/mixedfractions
 *
 * @author   Martin Björling
 * @email    martinbjorling@gmail.com
 * @version  1.0
 * @since    2015-11-24
 */

$answers = [];

while (true) {
	$inputString = stream_get_line(STDIN, 1024, PHP_EOL);

	if ($inputString == "0 0") break;

	$inputArr = explode(" ", $inputString);

	$numerator = $inputArr[0];
	$denominator = $inputArr[1];

	$wholeNumber = floor($numerator / $denominator);
	$newNumerator = $numerator % $denominator;
	

    $answers[] = $wholeNumber." ".$newNumerator." / ".$denominator."\n";

    
}

foreach ($answers as $value) {
	fwrite(STDOUT, $value);
}


?>