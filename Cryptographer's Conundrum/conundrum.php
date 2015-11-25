<?php
/**
 * Problem: Cryptographer's Conundrum
 * https://open.kattis.com/problems/conundrum
 *
 * @author   Martin Björling
 * @email    martinbjorling@gmail.com
 * @version  1.0
 * @since    2015-11-24
 */

$inputString = stream_get_line(STDIN, 1024, PHP_EOL);

$counter = 0;

for ($i = 0; $i < strlen($inputString); $i++) {
	$c = $inputString[$i];

	$j = $i % 3;

	switch ($j) {
		case 0:
			if ($c != "P") $counter++;
			break;
		case 1:
			if ($c != "E") $counter++;
			break;
		case 2:
			if ($c != "R") $counter++;
			break;
		default:
			break;
	}
}

fwrite(STDOUT, "".$counter);

?>