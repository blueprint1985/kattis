<?php
/**
 * Problem: Solving for Carrots
 * https://open.kattis.com/problems/carrots
 *
 * @author   Martin Björling
 * @email    martinbjorling@gmail.com
 * @version  1.0
 * @since    2015-11-24
 */

$inputString = stream_get_line(STDIN, 1024, PHP_EOL);

$inputArr = explode(" ", $inputString);

$contestants = $inputArr[0];
$carrots = $inputArr[1];

for ($i = 0; $i < $contestants; $i++) {
	$nextContestant = stream_get_line(STDIN, 1024, PHP_EOL);
}

fwrite(STDOUT, $inputArr[1]);

?>