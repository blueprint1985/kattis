<?php
/**
 * Problem: Kemija
 * https://open.kattis.com/problems/kemija08
 *
 * @author   Martin Björling
 * @email    martinbjorling@gmail.com
 * @version  1.0
 * @since    2015-11-24
 */
$inputString = stream_get_line(STDIN, 1024, PHP_EOL);

$i = 0;

$answer = "";

while ($i < strlen($inputString)) {
	$c = $inputString[$i];

	if ($c == 'a' || $c == 'e' || $c == 'i' || $c == 'o' || $c == 'u') {
		$answer .= $c;
		$i += 3;
	} else {
		$answer .= $c;
		$i++;
	}
}

fwrite(STDOUT, $answer);

?>