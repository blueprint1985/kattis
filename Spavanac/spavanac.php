<?php
/**
 * Problem: Spavanac
 * https://open.kattis.com/problems/spavanac
 *
 * @author   Martin Björling
 * @email    martinbjorling@gmail.com
 * @version  1.0
 * @since    2015-11-24
 */

$inputString = stream_get_line(STDIN, 1024, PHP_EOL);

$inputArr = explode(" ", $inputString);

$hours = $inputArr[0];
$minutes = $inputArr[1];

if ($minutes < 45) {
	if ($hours == 0) {
		$hours = 23;
	} else {
		$hours--;
	}
	
	$minutes = 60 + ($minutes-45);
} else {
	$minutes = $minutes - 45;
}

fwrite(STDOUT, $hours." ".$minutes);

?>