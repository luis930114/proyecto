<?php

namespace Agencia\MainBundle\Entity;

use Doctrine\ORM\Mapping as ORM;

/**
 * Solicitud
 *
 * @ORM\Table()
 * @ORM\Entity
 */
class Solicitud
{
    /**
     * @var integer
     *
     * @ORM\Column(name="id", type="integer")
     * @ORM\Id
     * @ORM\GeneratedValue(strategy="AUTO")
     */
    private $id;

    /**
     * @var string
     *
     * @ORM\Column(name="numero", type="string", length=255)
     */
    private $numero;

    /**
     * @var string
     *
     * @ORM\Column(name="Fecha", type="string", length=8)
     */
    private $fecha;

    /**
     * @var string
     *
     * @ORM\Column(name="Estado", type="string", length=255)
     */
    private $estado;

    /**
     * @var integer
     *
     * @ORM\Column(name="Solicitante", type="integer")
     */
    private $solicitante;

    /**
     * @var integer
     *
     * @ORM\Column(name="Contabilidad", type="integer")
     */
    private $contabilidad;

    /**
     * @var integer
     *
     * @ORM\Column(name="comision", type="integer")
     */
    private $comision;


    /**
     * Get id
     *
     * @return integer
     */
    public function getId()
    {
        return $this->id;
    }

    /**
     * Set numero
     *
     * @param string $numero
     *
     * @return Solicitud
     */
    public function setNumero($numero)
    {
        $this->numero = $numero;

        return $this;
    }

    /**
     * Get numero
     *
     * @return string
     */
    public function getNumero()
    {
        return $this->numero;
    }

    /**
     * Set fecha
     *
     * @param string $fecha
     *
     * @return Solicitud
     */
    public function setFecha($fecha)
    {
        $this->fecha = $fecha;

        return $this;
    }

    /**
     * Get fecha
     *
     * @return string
     */
    public function getFecha()
    {
        return $this->fecha;
    }

    /**
     * Set estado
     *
     * @param string $estado
     *
     * @return Solicitud
     */
    public function setEstado($estado)
    {
        $this->estado = $estado;

        return $this;
    }

    /**
     * Get estado
     *
     * @return string
     */
    public function getEstado()
    {
        return $this->estado;
    }

    /**
     * Set solicitante
     *
     * @param integer $solicitante
     *
     * @return Solicitud
     */
    public function setSolicitante($solicitante)
    {
        $this->solicitante = $solicitante;

        return $this;
    }

    /**
     * Get solicitante
     *
     * @return integer
     */
    public function getSolicitante()
    {
        return $this->solicitante;
    }

    /**
     * Set contabilidad
     *
     * @param integer $contabilidad
     *
     * @return Solicitud
     */
    public function setContabilidad($contabilidad)
    {
        $this->contabilidad = $contabilidad;

        return $this;
    }

    /**
     * Get contabilidad
     *
     * @return integer
     */
    public function getContabilidad()
    {
        return $this->contabilidad;
    }

    /**
     * Set comision
     *
     * @param integer $comision
     *
     * @return Solicitud
     */
    public function setComision($comision)
    {
        $this->comision = $comision;

        return $this;
    }

    /**
     * Get comision
     *
     * @return integer
     */
    public function getComision()
    {
        return $this->comision;
    }
}

