<?php
/**
 * Problem: Ragged Right
 * https://open.kattis.com/problems/raggedright
 *
 * @author   Martin Björling
 * @email    martinbjorling@gmail.com
 * @version  1.0
 * @since    2015-11-24
 */

$lineLengths = [];

while ($inputString = stream_get_line(STDIN, 1024, PHP_EOL)) {
	$lineLengths[] = strlen($inputString);
}

$last = array_pop($lineLengths);

if (count($lineLengths) > 0) {
	sort($lineLengths, SORT_NUMERIC);

	$longest = $lineLengths[count($lineLengths)-1];
} else {
	$longest = $last;
}

if ($last > $longest) {
	$longest = $last;
	$i = count($lineLengths)-1;
} else {
	$i = count($lineLengths)-2;
}

$score = 0;

while ($i >= 0) {
	$current = $lineLengths[$i];
	$score += pow(($longest-$current), 2);
	$i--;
}

fwrite(STDOUT, $score);


?>