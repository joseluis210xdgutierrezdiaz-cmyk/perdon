<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Carta para Sol</title>

    <style>
        * {
            box-sizing: border-box;
        }

        body {
            margin: 0;
            min-height: 100vh;
            background: #ffecec;
            display: flex;
            justify-content: center;
            align-items: center;
            font-family: Arial, sans-serif;
        }

        .contenedor {
            text-align: center;
        }

        /* SOBRE */
        .sobre {
            position: relative;
            width: 430px;
            height: 280px;
            margin: auto;
            perspective: 1000px;
        }

        .parte-atras {
            position: absolute;
            width: 100%;
            height: 100%;
            background: #e95f70;
            border-radius: 5px;
            z-index: 1;
        }

        /* CARTA */
        .carta {
            position: absolute;
            width: 370px;
            min-height: 240px;
            background: #fffafa;
            left: 30px;
            top: 20px;
            padding: 30px 25px;
            border-radius: 5px;
            z-index: 2;

            transform: translateY(100px);
            opacity: 0;

            transition: 1s ease;
        }

        .carta h2 {
            color: #d91f3c;
            margin-top: 0;
        }

        .mensaje {
            color: #222;
            font-size: 18px;
            line-height: 1.6;
            text-align: left;
        }

        /* CORAZONES */
        .corazones {
            position: absolute;
            top: 70px;
            left: 0;
            width: 100%;
            z-index: 4;
            display: flex;
            justify-content: center;
            gap: 35px;

            opacity: 0;
            transition: 1s;
        }

        .corazon {
            color: #e51b3e;
            font-size: 30px;
            animation: flotar 1.5s infinite alternate;
        }

        .corazon:nth-child(2) {
            color: #ef7180;
            animation-delay: .2s;
        }

        .corazon:nth-child(3) {
            color: #d91436;
            animation-delay: .4s;
        }

        .corazon:nth-child(4) {
            color: #f4a5ae;
            animation-delay: .6s;
        }

        @keyframes flotar {
            from {
                transform: translateY(0);
            }

            to {
                transform: translateY(-12px);
            }
        }

        /* PARTE DELANTERA DEL SOBRE */
        .parte-delantera {
            position: absolute;
            bottom: 0;
            left: 0;
            width: 100%;
            height: 65%;
            background: #ed6978;
            z-index: 5;

            clip-path: polygon(
                0 0,
                50% 65%,
                100% 0,
                100% 100%,
                0 100%
            );
        }

        /* TRIÁNGULO SUPERIOR */
        .tapa {
            position: absolute;
            top: 0;
            left: 0;
            width: 100%;
            height: 55%;
            background: #e51b3e;

            clip-path: polygon(
                0 0,
                50% 100%,
                100% 0
            );

            z-index: 6;
            transform-origin: top;
            transition: 1s;
        }

        /* BOTONES */
        .botones {
            margin-top: 50px;
        }

        button {
            padding: 14px 35px;
            margin: 0 10px;

            background: white;
            border: 2px solid #c51d3a;
            border-radius: 7px;

            color: #c51d3a;
            font-weight: bold;
            font-size: 17px;

            cursor: pointer;
        }

        button:hover {
            background: #ffe0e5;
        }

        /* SOBRE ABIERTO */
        .abierto .tapa {
            transform: rotateX(180deg);
            z-index: 1;
        }

        .abierto .carta {
            transform: translateY(-100px);
            opacity: 1;
            z-index: 4;
        }

        .abierto .corazones {
            opacity: 1;
        }
    </style>
</head>

<body>

    <div class="contenedor">

        <div class="sobre" id="sobre">

            <!-- Parte trasera -->
            <div class="parte-atras"></div>

            <!-- Carta -->
            <div class="carta">

                <h2>Para Sol ❤️</h2>

                <p class="mensaje">
                    Sol te quería pedir disculpas por dejarte de hablar,
                    me sentí mal en hacerlo y me haces falta aunque no
                    fuéramos nada, pero si te gustaría intentarlo de nuevo
                    por tercera vez y si no quieres pues no pasa nada.
                </p>

            </div>

            <!-- Corazones -->
            <div class="corazones">
                <span class="corazon">♥</span>
                <span class="corazon">♥</span>
                <span class="corazon">♥</span>
                <span class="corazon">♥</span>
            </div>

            <!-- Tapa -->
            <div class="tapa"></div>

            <!-- Parte delantera -->
            <div class="parte-delantera"></div>

        </div>

        <!-- Botones -->
        <div class="botones">
            <button onclick="abrirCarta()">OPEN</button>
            <button onclick="cerrarCarta()">RESET</button>
        </div>

    </div>

    <script>

        function abrirCarta() {
            document.getElementById("sobre").classList.add("abierto");
        }

        function cerrarCarta() {
            document.getElementById("sobre").classList.remove("abierto");
        }

    </script>

</body>
</html>